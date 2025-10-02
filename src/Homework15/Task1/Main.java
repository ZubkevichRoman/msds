package Homework15.Task1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /**
         * Task1
         * Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
         * 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
         * При решении использовать коллекции.
         */
        HashSet<String> map = new HashSet<>();
        String userInput = "1,2,3,4,5,6,5,5,5";
        String[] split = userInput.split(",");
        for (String numbers : split){
            map.add(numbers);
        }
        System.out.println(map);
    }
}
