package JavaCoreHomework.Homework9.Task1;

public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println(" i m a dog : Gaw Gaw Gaw Gaw");

    }

    @Override
    void eat(String food) {
        if (food == null) {
            System.out.println(" Get me food ");

        }
        if (food == "meat") {
            System.out.println(" i love meat , ths ");

        }
        if (food == "bone") {
            System.out.println("I love bone ");

        } else {
            System.out.println(" Don't give me the grass and another garbage ");
        }
    }
}
