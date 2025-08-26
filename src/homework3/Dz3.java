package homework3;

import java.util.Arrays;

public class Dz3 {
    public static void main(String[] args) {
        // task 1 Пройти по массиву, вывести все элементы в прямом и в обратном порядке
        int[] array = new int[]{29, 34, 32, 75, 45};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = array[i];
            System.out.print(" " + result);
        }
        int result2 = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result2 = array[i];
            System.out.print(" " + result2);
        }
        //task 2 Найти минимальный-максимальный элементы и вывести в консоль.
        int[] array2 = new int[]{2, 45, 34, 76, 23, 45, 31};
        int max = array2[0];
        int min = array2[0];

        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];

            }
            if (array2[i] > max) {
                max = array2[i];

            }

        }
        System.out.println("Минимальный" + min);
        System.out.println("Максимальный" + max);

        //task 3 Найти индексы минимального и максимального элементов и вывести в консоль
        int[] array3 = new int[]{23, 6876, 2134, 435, 23, 46578, 39};
        int max2 = array3[0];
        int min2 = array3[0];
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > max2) {
                max2 = array3[i];
                indexmax = i;
            }
            if (array3[i] < min2) {
                min2 = array3[i];
                indexmin = i;
            }

        }
        System.out.println("Минимальный элемент: " + min2 + " (индекс " + indexmin + ")");
        System.out.println("Максимальный элемент: " + max2 + " (индекс " + indexmax + ")");

//task 4 Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет
        int[] array4 = new int[]{3, 0, 4, 35, 21, 0, 546, 3, 0, 5, 2, 3,};
        int HowMatchZero = 0;
        for (int zero : array4) {
            if (zero == 0) {
                HowMatchZero++;
            }
            if (HowMatchZero == 0) {

            }
        }
        if (HowMatchZero == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Нулевых элементов" + "  " + HowMatchZero);
        }

        // task 5 Пройти по массиву и поменять местами элементы первый и последний, второй и
        // предпоследний и т.д.

        int[] array5 = {10, 20, 30, 40, 50, 60}; //TODO не понятно
        int n = array5.length;
        for (int i = 0; i < n / 2; i++) {
            int temm = array5[i];
            array5[i] = array5[n - 1 - i];
            array5[n - 1 - i] = temm;
        }
        System.out.println("После обмена: " + Arrays.toString(array5));
        // task 6 Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).
        int[] array6 = {10, 20, 30, 40, 50, 60};
        boolean num23 = true;
        for (int i = 1; i < array6.length; i++) {
            if (array6[i] <= array6[i - 1]) {
                num23 = false;
            }
            break;
        }
        if (num23) {
            System.out.println("Массив возрастающий " + " " + Arrays.toString(array6));
        } else {
            System.out.println("Массив не возрастает " + " " + Arrays.toString(array6));
        }
//        Имеется массив из неотрицательных чисел(любой). Представьте что массив
//        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//        содержит нуля в начале, кроме самого числа 0

        int[] array8 = new int[]{9, 9, 9};
        for (int i = array8.length - 1; i >= 0; i--) {
            if (array8[i] < 9) {
                array8[i]++;
                System.out.println(Arrays.toString(array8));
                return;
            } else {
                array8[i] = 0;
            }
        }
        int[] result3 = new int[array8.length + 1];
        result3[0] = 1;

        System.out.println(Arrays.toString(result3));
    }
}