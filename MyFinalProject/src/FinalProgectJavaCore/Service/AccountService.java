package FinalProgectJavaCore.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String, Integer> accountBalances = new HashMap<>();

    public void loadBalancesFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String account = parts[0].trim();
                    int balance = Integer.parseInt(parts[1].trim());
                    accountBalances.put(account, balance);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке балансов: " + e.getMessage());
        }
    }

    public boolean hasAccount(String accountNumber) {
        return accountBalances.containsKey(accountNumber);
    }

    public int getBalance(String accountNumber) {
        return accountBalances.getOrDefault(accountNumber, 0);
    }

    public boolean transfer(String from, String to, int amount) {
        if (!hasAccount(from) || !hasAccount(to)) return false;
        if (getBalance(from) < amount) return false;

        accountBalances.put(from, getBalance(from) - amount);
        accountBalances.put(to, getBalance(to) + amount);
        return true;
    }

    public void printBalances() {
        System.out.println("Текущие балансы:");
        accountBalances.forEach((acc, bal) ->
                System.out.println("Счёт: " + acc + ", баланс: " + bal));
    }

    public void saveBalancesToFile(File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (Map.Entry<String, Integer> entry : accountBalances.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            System.out.println("Балансы успешно сохранены в файл: " + file.getName());
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении балансов: " + e.getMessage());
        }
    }

}


