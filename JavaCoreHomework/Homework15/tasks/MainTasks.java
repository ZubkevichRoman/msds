package JavaCoreHomework.Homework15.tasks;

import java.util.LinkedList;

public class MainTasks {
    public static void main(String[] args) {
        /**
         * |Практика:
         * Задача 1:
         * 1.1 Создать коллекцию ArrayList стран мира.
         * 1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
         * 1.3 Заменить 2-й элемент.
         * 1.4 Удалить его по индексу.
         * 1.5 Удалить любой элемент по значению.
         * 1.6 Узнать индекс любого элемента.
         * 1.7 Проверить, содержится ли элемент в коллекции (любой).
         * Задача 2:
         * 2.1 Создать двусвязный список стран мира.
         * 2.2 Добавить к этому списку 4 страны (2 в начало и 2 в конец), вывести результат в
         * консоль (Использовать методы addFirst/addLast).
         * 2.3 Удалить по одному элементу из начала и из конца списка.
         * 2.4 Получить по одному элементу из начала и из конца списка.
         * Задача 3:
         * 3.1 Создать класс Person.
         * 3.2 Создать HashSet в классе Main.
         * 3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
         * 3.4 Удалить 2 объекта из коллекции.
         * 3.5 Проверить, содержится ли оставшийся объект в коллекции.
         * Задача 4:
         * Создать дженерик класс Storage с полем того типа который передаем в дженерик при
         * создании объекта. Сделать конструктор по дефолту и конструктор с этим полем.
         * Добавить геттеры/сеттеры. В методе main создать 2 объекта на основе этого дженерика и
         * проверить их работу
         */
        //task1
        // ArrayList<String> countries = new ArrayList<>();
        //  countries.add("Bulgaria");
        //  countries.add("Russia");
        //  countries.add("Belarus");
        //  for (String ct : countries) {
        //      System.out.println(ct);
        //  }
        //  System.out.println("--------------------");
        //  countries.set(2, "Turkey");
        //  for (String ct : countries) {
        //      System.out.println(ct);
        //  }
        //  System.out.println("------------");
        //  countries.remove(2);
        //  for (String ct : countries) {
        //      System.out.println(ct);
        //  }
        //  System.out.println("----------");
        //  System.out.println(countries.indexOf("Russia"));
        //  System.out.println("---------");
        //  System.out.println(countries.contains("Russia"));

        LinkedList<String> elements = new LinkedList<>();
        elements.addFirst("Russia");
        elements.addFirst("Bulgaria");
        elements.addLast("Belarus");
        elements.addLast("Turkey");
        System.out.println(elements);
        elements.removeFirst();
        elements.removeLast();
        System.out.println(elements);
        System.out.println(elements.getFirst());
        System.out.println(elements.getLast());
    }
}
