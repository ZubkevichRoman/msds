package JavaCoreHomework.Homework9.Task1;

public class Tiger extends Animal {


    @Override
    void voice() {
        System.out.println(" I m tiger : R-R-R-r-r-r ");

    }

    @Override
    void eat(String food) {
        if (food == null) {
            System.out.println(" Get me food ");

        }
        if (food == "meat") {
            System.out.println(" i love meat , ths ");

        } else {
            System.out.println(" Don't give me the grass and another garbage ");
        }

    }
}
