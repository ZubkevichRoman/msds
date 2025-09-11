package Homework9.Task1;

public class Rabbit extends Animal {


    @Override
    void voice() {
        System.out.println(" i m a rabbit:");
        ;
    }

    @Override
    void eat(String food) {
        if (food == null) {
            System.out.println(" Get me food ");

        }
        if (food == "meat") {
            System.out.println(" I don't like meat ... ");

        }
        if (food == "grass"){
            System.out.println("I love grass ");

        }
        else {
            System.out.println(" Don't give me this garbage , give me grass ");

        }

    }
}
