package Homework16.Task2;

import java.util.HashMap;
import java.util.Iterator;

public class MainTask2 {
    public static void main(String[] args) {
        /**
         * На вход поступает массив непустых строк, создайте и верните Map<String, String> следующим образом:
         * для каждой строки добавьте её первый символ в качестве ключа с последним символом в качестве значения.
         * Пример:
         * pairs("code", "bug") -> {"b": "g", "c": "e"}
         * pairs("man", "moon", "main") -> {"m": "n"}
         * pairs("man", "moon", "good", "night") -> {"g": "d", "m": "n", "n": "t"}
         */
        String[] array1 = new String[]{"code", "bug"};
        String[] array2 = new String[]{"man", "moon", "main"};
        String[] array3 = new String[]{"man", "moon", "good", "night"};
        HashMap<String, String> map1 = new HashMap<>();
        for (String s : array1){
            map1.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }
        System.out.println(map1);
        HashMap<String, String> map2 = new HashMap<>();
        for (String s : array2){
            map2.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }
        System.out.println(map2);
        HashMap<String, String> map3 = new HashMap<>();
        for (String s : array3){
            map3.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }
        System.out.println(map3);
    }
}
