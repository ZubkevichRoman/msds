package FinalProgectJavaCore.Main;

import FinalProgectJavaCore.Exeptions.InvalidTransferFormatException;
import FinalProgectJavaCore.Service.Report;
import FinalProgectJavaCore.Service.TransferService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidTransferFormatException, IOException {
        File inputDir = new File("MyFinalProject\\src\\Input");
        File archiveDir = new File("MyFinalProject\\src\\Archive");
        File balanceFile = new File(archiveDir, "accounts.txt");
        File reportFile = new File(archiveDir, "report.txt");

        try (Report report = new Report(reportFile.getAbsolutePath())) {
            TransferService service = new TransferService(report);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер операции:");
            System.out.println("1 - Парсинг файлов переводов");
            System.out.println("2 - Вывод отчета о переводах");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    service.loadBalances(balanceFile);

                    File[] files = inputDir.listFiles((dir, name) -> name.endsWith(".txt"));
                    if (files == null || files.length == 0) {
                        System.out.println("Нет подходящих файлов для обработки в папке input.");
                        return;
                    }

                    for (File transferFile : files) {
                        try {
                            service.ParseInputFiles(transferFile);
                            service.UpdateInformationAboutTransfer(transferFile);
                        } catch (Exception e) {
                            System.out.println("Ошибка при обработке файла " + transferFile.getName() + ": " + e.getMessage());
                        }
                    }
                }

                case "2" -> {
                    if (!reportFile.exists()) {
                        System.out.println("Файл отчета не найден.");
                        return;
                    }
                    System.out.println("История переводов:");
                    try (BufferedReader reader = new BufferedReader(new FileReader(reportFile))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                }
                default -> System.out.println("Неверный ввод. Ожидается 1 или 2.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с отчетом: " + e.getMessage());
        }
    }
}

