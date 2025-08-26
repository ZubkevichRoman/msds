package homework2;

import java.util.Scanner;

public class Dz2 {
    public static void main (String[] args) {
        //task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(" Четное ");
        } else {
            System.out.println("не четное ");
        }

        //task 2
        System.out.println("Введите температуру ");
        double temp = scanner.nextInt();
        if (temp >= -5) {
            System.out.println("Warm");
        } else if (temp <= -20) {
            System.out.println("Cold");
        }

        //task 3
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }

        //task 4
        int number2 = 7;
        while (number2 <= 98) {
            number2 = number2 + 7;
            System.out.print(number2 + " ");
        }

        //task *
        System.out.println("Введите любое целое положительное число");
        int count = 0;
        for (int number1 = scanner.nextInt(); number1 >= 1; number1--) {
            count = count + number1;
            System.out.println(count);
            scanner.close();
        }
    }
}
