package JavaCoreHomework.Homework8.Task2;

public class Circle extends Shape{
    private int radios = 6;

    public int getRadios() {
        return radios;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }

    public Circle(String typeOfShape) {
        super(typeOfShape);
    }
    //S = π × r²

    @Override
    public void calculateArea() {
        setArea((int) (Math.PI * Math.cbrt(getRadios())));
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(0);
    }
}
