package FinalProgectJavaCore.Service;

import FinalProgectJavaCore.Exeptions.InvalidTransferFormatException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class TransferService {
    protected String fromAccount = null;
    protected String toAccount = null;
    protected int amount;
    private File balanceFile;
    private Report reportService;

    public TransferService(Report reportService) {
        this.reportService = reportService;
    }

    private static final Pattern ACCOUNT_PATTERN = Pattern.compile("\\d{5}-\\d{5}");// для номера аккаунта
    private static final Pattern AMOUNT_PATTERN = Pattern.compile("\\d+");// для суммы
    AccountService accountService = new AccountService();

    public void ParseInputFiles(File file) throws InvalidTransferFormatException, IOException {
        if (!file.getName().endsWith(".txt")) {
            throw new InvalidTransferFormatException("Файл должен быть в формате .txt");
        }
        if (!file.exists()) {
            System.out.println("Файл не найден: " + file.getAbsolutePath());
            throw new IOException();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //поиск номера счета
                if (line.contains("номер счета с")) {
                    var matcher = ACCOUNT_PATTERN.matcher(line);
                    if (matcher.find()) {
                        fromAccount = matcher.group();
                    }
                }
                if (line.contains("номер счета на")) {
                    var matcher = ACCOUNT_PATTERN.matcher(line);
                    if (matcher.find()) {
                        toAccount = matcher.group();
                    }
                }
                //поиск суммы
                if (line.contains("сумма для перевода")) {
                    var matcher = AMOUNT_PATTERN.matcher(line);
                    if (matcher.find()) {
                        amount = Integer.parseInt(matcher.group());
                    }
                }
            }
            if (fromAccount == null || toAccount == null || amount <= 0) {
                System.out.println("Ошибка: неполные или неверные данные.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public void loadBalances(File file) {
        this.balanceFile = file;
        accountService.loadBalancesFromFile(file);
    }

    public void UpdateInformationAboutTransfer(File transferFile) {
        if (fromAccount == null || toAccount == null || amount <= 0) {
            System.out.println("Ошибка: неполные или неверные данные.");
            return;
        }
        boolean success = accountService.transfer(fromAccount, toAccount, amount);
        if (success) {
            accountService.printBalances();
            reportService.logs(transferFile.getName(), fromAccount,
                    toAccount, amount, true, "неверные данные");
            accountService.saveBalancesToFile(balanceFile);
        } else {
            reportService.logs(transferFile.getName(), fromAccount,
                    toAccount, amount, false, "недостаточно средств или неверный счет");
        }
    }
}

