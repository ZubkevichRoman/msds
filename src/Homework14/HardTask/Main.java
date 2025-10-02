package Homework14.HardTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Допустим есть txt файл с номерами документов. Номером документа является строка,
         * состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
         * номер документа с новой строки и в строке никакой другой информации, только номер
         * документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
         * последовательности docnum(далее любая последовательность букв/цифр) или
         * contract(далее любая последовательность букв/цифр). Написать программу для чтения
         * информации из входного файла - путь к входному файлу должен задаваться через
         * консоль. Программа должна проверять номера документов на валидность. Валидные
         * номера документов следует записать в один файл-отчет. Невалидные номера документов
         * следует записать в другой файл-отчет, но после номеров документов следует добавить
         * информацию о том, почему этот документ не валиден.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу указав (.txt) в конце ");
        String fileDocument = scanner.next();
        File document = new File(fileDocument);
        Pattern regexForNumberDocuments = Pattern.compile(("^(docnum[a-zA-Z0-9]{15})$|contract[a-zA-Z0-9]{15}"));
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(document))) {
            FileWriter valid = new FileWriter("\\D:validFile.txt");
            FileWriter noValid = new FileWriter("\\D:noValidFile.txt");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.matches(String.valueOf(regexForNumberDocuments))) {
                    valid.write(line);
                } else {
                    if (line.length() < 15) {
                        noValid.write(line + " длина документа меньше 15 символов " + "\n");
                    } else if (line.length() > 15) {
                        noValid.write(line + " длина документа больше  15 символов " + "\n");
                    } else if (!line.startsWith("contract") || !line.startsWith("docnum")) {
                        noValid.write(line + "строка не начинается с contract или  docnum" + "\n");
                    } else if (line.contains(" ")) {
                        noValid.write(line + "Содержаться пробелы" + "\n");
                    } else {
                        noValid.write(line + " что то не так " + "\n");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

