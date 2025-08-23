import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {
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
        Scanner scanner = new Scanner(System.in);
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
        int number = 7;
        while (number <= 98) {
            number = number + 7;
            System.out.print(number + " ");
        }

        //task *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int count = 0;
        for (int number = scanner.nextInt(); number >= 1; number--) {
            count = count + number;
            System.out.println(count);
        }
    }
}
