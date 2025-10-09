package Homework17.Task3;

import java.util.function.Function;

public class ConvertedBynToUsd {
    @Override
    public String toString() {
        return "ConvertedBynToUsd{}";
    }

    /**
     * Используя Function реализовать лямбду, которая будет принимать в себя строку в
     * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
     * возвращать сумму, переведенную сразу в доллары
     */
    public void converted(String valute) {
        if (!valute.matches("^\\d+\\sBYN")) {
            System.out.println("Введены некорректные даннные!");

        }
        Function<String, Double> convertByn = s -> {
            String newValute = valute.replaceAll("\\D+", "");
            double courseDollar = 3.01;
            int valuteBYN = 0;
            valuteBYN = Integer.parseInt(newValute);
            return valuteBYN / courseDollar;
        };
        System.out.println(  convertByn.apply(valute) + " USD");
    }
}


