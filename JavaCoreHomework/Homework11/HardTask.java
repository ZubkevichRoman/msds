package JavaCoreHomework.Homework11;

import java.util.Scanner;

public class HardTask {
    public static void main(String[] args) {
        /**
         * Дана строка произвольной длины с произвольными словами. Написать программу для
         *  проверки является ли любое выбранное слово в строке палиндромом.
         *  Например, есть строка, вводится число 3, значит необходимо проверить является ли
         *  3-е слово в этой строке палиндромом.
         *  Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
         *  например, в строке 5 слов, а на вход программе передали число 500
         */
        Scanner scanner = new Scanner(System.in);
        String stroke = "a string of arbitrary length with arbitrary words ";
        String[] words = stroke.split(" ");
        System.out.println("Введите номер строки : ");
        System.out.println("всего строк : " + words.length);
        int numberStroke = scanner.nextInt();
        if (numberStroke > words.length) {
            System.out.println("Введите номер существующей строки ");
            return;
        }
        if (polindromeMethod(stroke)) {
            System.out.println("Это полиндром");
        }else {
            System.out.println("Это не полиндром");
        }


    }

    private static boolean polindromeMethod(String stroke) {
            String clean = stroke.replaceAll("\\s+", "").toLowerCase();
            int length = clean.length();
            int forward = 0;
            int backward = length - 1;
            while (backward > forward) {
                char forwardChar = clean.charAt(forward++);
                char backwardChar = clean.charAt(backward--);
                if (forwardChar != backwardChar)
                    return false;
            }
            return true;
    }

}

