package JavaCoreHomework.Homework8.Task2;

public class Rectangle extends Shape {
    private int weight = 7;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int length = 14;


    public Rectangle(String typeOfShape) {
        super(typeOfShape);
    }

    @Override
    public void calculateArea() {
        setArea(getLength() * getWeight());

    }

    @Override
    public void calculatePerimeter() {
        setPerimeter((getWeight() + getLength()) * 2);

    }
}
