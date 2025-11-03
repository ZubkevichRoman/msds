package JavaCoreHomework.Homework16.Task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /**
         * На вход поступает массив строк, верните Map<,String Boolean>, где каждая отдельная
         * строка является ключом, и ее значение равно true,
         * если эта строка встречается в массиве 2 или более раз. Пример:
         * wordMultiple("a", "b", "a", "c", "b") → {"a": true, "b": true, "c": false}
         * wordMultiple("c", "b", "a") → {"a": false, "b": false, "c": false}
         * wordMultiple("c", "c", "c", "c") → {"c": true}
         */
        String[] array1 = new String[]{"a", "b", "a", "c", "b"};
        String[] array2 = new String[]{"c", "b", "a"};
        String[] array3 = new String[]{"c", "c", "c", "c"};
        HashMap<String, Boolean> map = new HashMap<>();

        for (String s : array1) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        System.out.println(map);
        HashMap<String, Boolean> map1 = new HashMap<>();
        for (String s : array2) {
            if (map1.containsKey(s)) {
                map1.put(s, true);
            } else {
                map1.put(s, false);
            }
        }
        System.out.println(map1);
        HashMap<String, Boolean> map2 = new HashMap<>();
        for (String s : array3) {
            if (map2.containsKey(s)) {
                map2.put(s, true);
            } else {
                map2.put(s, false);
            }
        }
        System.out.println(map2);
    }
}
