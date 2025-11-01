package JavaCoreHomework.Homework7.Apple;

public class Apple extends Main{
    /**
     * Задача *:
     * Создать класс Apple и добавить в него поле color с модификатором доступа private и
     * инициализировать его. В методе main другого класса создать объект Apple, и не
     * используя сеттеры изменить значение поля color
     **/
    private String color = "Green";
    private String color() {
        return color = "Red";
    }
    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple color: " + color;
    }
}
