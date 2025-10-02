package Homework15.Task2;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать класс, который будет хранить в себе коллекцию с названиями животных.
         * Реализовать методы удаления и добавления животных по следующим правилам:
         * добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
         * объекта этого класса в main методе другого класса
         */
        Animals animals = new Animals();
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Lyagyshka");
        animals.add("Strekoza");
        System.out.println(animals);

    }
}
