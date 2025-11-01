package JavaCoreHomework.Homework8.Task2;

abstract public class Shape {
    /**
     * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
     * Shape, Triangle, Rectangle, Circle. Реализовать
     * функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
     * абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
     * периметра всех фигур в массиве.
     */
    private String typeOfShape;
    private int area;
    private int perimeter;

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public Shape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;

    }

    public void infoShape() {
        System.out.println(" У фигуры " + getTypeOfShape() + " периметр : "
                + getPerimeter() + " и площадь : " + getArea());
    }


}
