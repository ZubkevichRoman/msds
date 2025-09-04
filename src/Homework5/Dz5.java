/*package Homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dz5 {
    public static void main(String[] args) {
         //*canner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] array = new int[3][3];
        int sum = array[0][0];
          *//**1.1 Создать двумерный массив, заполнить его случайными числами.
         1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
         1.3 Найти сумму всех получившихся элементов и вывести в консоль
         *//*
        System.out.println(" Изначальный массив ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(0, 30);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите число для добавления");
        int userNumber = scanner.nextInt();
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                array[i][j]= userNumber +array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
               sum = sum + array[i][j];


            }

        }

        System.out.print("Сумма всех элементов массива: " + sum + " ");
        scanner.close();
        *//**
         * Создать программу для раскраски шахматной доски с помощью цикла. Создать
         * двумерный массив String 8х8. С помощью циклов задать элементам массива значения
         * B(Black) или W(White). При выводе результат работы программы должен быть
         * следующим:
         * W B W B W B W B
         * B W B W B W B W
         * W B W B W B W B
         * B W B W B W B W
         * W B W B W B W B
         * B W B W B W B W
         * W B W B W B W B
         * B W B W B W B W
         *//*

        String[][] deepArray = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    deepArray[i][j] = "W";
                } else {
                    deepArray[i][j] = "B";
                }

            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(deepArray[i][j] + " ");
            }
            System.out.println();
        }
        *//**
         * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой
         * Формат входных данных:
         * Программа получает на вход два числа n и m.
         * Формат выходных данных:
         * Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
         *//*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число по вертикали: ");
        int n = scanner.nextInt();
        System.out.println("Введите число по горизонтали : ");
        int m = scanner.nextInt();
        int[][] deepArray2 = new int[n][m];
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    deepArray2[i][j] = value++;

                } else {
                        deepArray2[i][j] = value++;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", deepArray2[i][j]);

            }
            System.out.println();
        }


    }
}*/
