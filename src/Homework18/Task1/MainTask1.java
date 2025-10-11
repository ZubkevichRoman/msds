package Homework18.Task1;

import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {
        /**
         * Задача 1:
         * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
         * Stream'oB:
         * - Удалить дубликаты
         * - Оставить только четные элементы
         * - Вывести сумму оставшихся элементов в стриме
         */
        List<Integer> streams = List.of(1, 2, 3, 4, 5, 5, 5, 5, 6, 67, 8, 78);
        int sum = streams.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

    }

}
