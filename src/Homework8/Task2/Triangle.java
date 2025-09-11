package Homework8.Task2;

public class Triangle extends Shape {
    private int sideA = 14;
    private int sideB = 14;
    private int sideC = 7;

    @Override
    public void calculateArea() { // : S = √(р (р — а)(р — b)(p — c)),
        double semiPerimeter = (double) (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPerimeter *
                (semiPerimeter - sideA) *
                (semiPerimeter - sideB) *
                (semiPerimeter - sideC));
        setArea((int) area);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(getSideA() + getSideB() + getSideC());
    }

    public Triangle(String typeOfShape) {
        super("Треугольник");
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}
