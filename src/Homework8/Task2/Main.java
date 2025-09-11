package Homework8.Task2;

public class Main {
    public static void main(String[] args) {
        /**
         * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
         * Shape, Triangle, Rectangle, Circle. Реализовать
         * функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
         * абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
         * периметра всех фигур в массиве.
         */
         double sumPerimeters = 0;
         Shape[] shapes = new Shape[5];
         shapes[0] = new Triangle("Треугольник");
         shapes[1] = new Rectangle("прямоугольник");
         shapes[2] = new Circle("Circle");
         shapes[3] = new Rectangle("Rectangle");
         shapes[4] = new Circle("Circle");
        for ( Shape shape : shapes){
            shape.calculatePerimeter();
            shape.calculateArea();
            shape.getTypeOfShape();
            sumPerimeters += shape.getPerimeter();
        }
        System.out.println(sumPerimeters);




    }
}
