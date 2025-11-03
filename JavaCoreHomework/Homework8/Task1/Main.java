package JavaCoreHomework.Homework8.Task1;

public class Main {
    public static void main(String[] args) {
        /// Создать классы "Директор", "Рабочий", "Бухгалтер".
        /// Реализовать интерфейс с методом,
        /// который печатает название должности и
        /// имплементировать этот метод в созданные классы
        IJobTitle accountant = new Accountant();
        IJobTitle director = new Director();
        IJobTitle worker  = new Worker();
        accountant.printJobTitle();
        director.printJobTitle();
        worker.printJobTitle();

    }
}

