package JavaCoreHomework;

public class ReverseIntegerNumber {
    /**
     * 3. Реверс целого числа
     * Условие: Напишите метод, который переворачивает цифры целого числа. Учтите переполнение.
     * Пример: 123 → 321, -120 → -21
     */
    public static void main(String[] args) {
        int input = -120;
        int result = 0;
        while (input != 0) {
            int numbs = input % 10;
            input /= 10;
            result = result * 10 + numbs;
        }
        System.out.println(result);
    }

}

