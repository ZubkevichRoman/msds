package JavaCoreHomework.Homework17.Task4;

import java.util.Scanner;
import java.util.function.Supplier;

public class MainTask4 {
    public static void main(String[] args) {
        /**
         * Используя Supplier написать метод, который будет возвращать введенную с консоли
         * строку задом наперед
         */
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сроку:");
            StringBuilder userInput = new StringBuilder(scanner.nextLine());
            return userInput.reverse().toString();
        };
        System.out.println(supplier.get());
    }
}
