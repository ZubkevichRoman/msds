package Homework9.Task1;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
         * Переопределить методы voice(), eat(String food) чтобы они выводили верную
         * информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
         * Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
         * туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
         * или другую строку то он будет недоволен
         */
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal rabbit = new Rabbit();
        tiger.voice();
        tiger.eat("meat");
        dog.voice();
        dog.eat("bone");
        rabbit.voice();
        rabbit.eat("grass");



    }
}
