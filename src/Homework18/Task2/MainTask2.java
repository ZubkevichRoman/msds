package Homework18.Task2;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTask2 {
    public static void main(String[] args) {
        /**
         * Создать набор данных в формате id-пате, сохраненный в Мар. Необходимо отобрать из
         * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
         * Среди отобранных значений отобрать только те, которые имеют нечетное количество
         * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.v
         */
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Maria");
        names.put(2, "Sasha");
        names.put(3, "Sania");
        names.put(4, "Oleg");
        names.put(5, "Vasya");
        names.put(6, "Roman");
        names.put(7, "Sergey");
        names.put(8, "Aleksander");
        names.put(9, "Ilia");
        names.put(10, "Ashot");
        List<Integer> neededID = List.of(1, 2, 5, 8, 9, 13);
        List<String> result = names.entrySet().stream()
                .filter(Entry -> neededID.contains(Entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}
