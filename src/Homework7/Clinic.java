package Homework7;

public class Clinic {
    public static void main(String[] args) {
        Patient p1 = new Patient(1);
        Patient p2 = new Patient(2);
        Patient p3 = new Patient(3);

        Therapist therapist = new Therapist();

        therapist.assignDoctor(p1);
        p1.treat();

        therapist.assignDoctor(p2);
        p2.treat();

        therapist.assignDoctor(p3);
        p3.treat();
    }
}
