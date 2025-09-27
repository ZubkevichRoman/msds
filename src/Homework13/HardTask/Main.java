package Homework13.HardTask;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Написать try/catch/finally, в котором finally вызван не будет
         */
        try {
            System.out.println("block try ");
            System.exit(0);
        }catch (Exception e){
            throw new Exception();
        }finally {
            System.out.println("block finally");
        }

    }
}
