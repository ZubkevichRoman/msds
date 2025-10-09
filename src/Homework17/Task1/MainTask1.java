package Homework17.Task1;

import java.time.LocalDate;
import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        /**
         Задача 1:
         Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
         когда пользователю исполнится 100 лет. Использовать Date/Time API
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате (гггг-мм-дд) : ");
        String dateOfBirth = scanner.nextLine();
        LocalDate birth = LocalDate.parse(dateOfBirth);
        LocalDate birthDay100 = birth.plusYears(100);
        System.out.println("100 лет исполнится в: " + birthDay100 + " году");



    }

}

