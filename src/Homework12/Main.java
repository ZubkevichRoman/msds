package Homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /**
         * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
         *  аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
         *  только из прописных букв, без чисел.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String userStroke = scanner.next();
        Pattern Abbreviation = Pattern.compile("([А-Я]{2,6})");
        Matcher matcher = Abbreviation.matcher(userStroke);
        System.out.println();
        while (matcher.find()) {
            if (matcher.group(0) != null) {
                System.out.println(matcher.group());
            }

        }
    }
}
