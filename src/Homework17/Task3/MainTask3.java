package Homework17.Task3;

public class MainTask3 {
    public static void main(String[] args) {
        /**
         * Используя Function реализовать лямбду, которая будет принимать в себя строку в
         * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
         * возвращать сумму, переведенную сразу в доллары
         */
        ConvertedBynToUsd convertedBynToUsd = new ConvertedBynToUsd();
        convertedBynToUsd.converted("2000 BYN");


    }
}
