package JavaCoreHomework.Homework17.Task2;

import java.util.Arrays;
import java.util.function.Predicate;

public class MainTask2 {
    public static void main(String[] args) {
        /**
         * Используя Predicate среди массива чисел вывести только те, которые являются
         * положительными
         */
        Integer[] array = new Integer[]{1, 2, 3, -4, 5, 6, 7, 8, 9, -190, -34432, -333, -34323};
        Predicate<Integer> isEven = integer -> integer > 0;
        Arrays.stream(array).filter(isEven).forEach(System.out::println);
    }
}
