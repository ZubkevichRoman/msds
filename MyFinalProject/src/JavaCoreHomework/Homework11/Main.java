package JavaCoreHomework.Homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
         *  найденные строки и их длину.
         *  2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
         *  значений их длины.
         *  3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
         *  средней, а также их длину.
         * 4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
         *  Если таких слов несколько, найти первое из них.
         *  5. Вывести на консоль новую строку, которой задублирована каждая буква из
         *  начальной строки. Например, "Hello"-> "HHeelllloo".
         */
        /**
         * 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
         * найденные строки и их длину.
         */
        System.out.println(" задание 1: ");
        Scanner scanner = new Scanner(System.in);
        String lineOne;
        String lineTwo;
        String lineThree;
        System.out.println("Write first line: ");
        lineOne = scanner.next();
        System.out.println("Write second line: ");
        lineTwo = scanner.next();
        System.out.println("Write third line: ");
        lineThree = scanner.next();
        String[] array = {lineOne, lineTwo, lineThree};
        scanner.close();
        String minLine = array[0];
        String maxLine = array[0];
        String midLine = array[0];
        for (String s : array) {
            if (s.length() < minLine.length()) {
                minLine = s;
            }
            if (s.length() > maxLine.length()) {
                maxLine = s;
            }
            if (s.length() > minLine.length() && s.length() < minLine.length()) {
                midLine = s;
            }

        }
        System.out.println("Maximum line length: " + maxLine);
        System.out.println("Minimal line length: " + minLine);

        /**
         * 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
         * значений их длины.
         */
        System.out.println("Task 2: ");
        System.out.println("Min line: " + minLine + " ;" + " " + "Mid line: " + midLine + " ;" + " " + "max line: " + maxLine + ".");


        /**
         * 3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
         *  средней, а также их длину.
         */
        System.out.println("task3");
        int averageLine;
        averageLine = (lineOne.length() + lineTwo.length() + lineThree.length());
        averageLine = averageLine / 3;
        if (lineOne.length() < averageLine) {
            System.out.println("line less average line : " + lineOne);
        }
        if (lineTwo.length() < averageLine) {
            System.out.println("line less average line : " + lineTwo);
        }
        if (lineThree.length() < averageLine) {
            System.out.println("line less average line : " + lineThree);
        }

        /**
         * Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
         * Если таких слов несколько, найти первое из них.
         */
        System.out.println("task4");
        char[] deferenceSymbol = array[0].toCharArray();
        char[] deferenceSymbol1 = array[1].toCharArray();
        char[] deferenceSymbol2 = array[2].toCharArray();
        for (int i = 0; i < deferenceSymbol.length; i++) {
            for (int j = 0; j < deferenceSymbol1.length; j++) {
                for (int k = 0; k < deferenceSymbol2.length; k++) {//TODO не доделано


                }
            }
        }

        System.out.println("Task5");
        String dsf = "hello world";
        String duplicateCharacter = "";

        char[] charArray = dsf.toCharArray();
        for (char c : charArray) {
            duplicateCharacter = duplicateCharacter + c + c;
        }

        System.out.println(duplicateCharacter);


    }
}
