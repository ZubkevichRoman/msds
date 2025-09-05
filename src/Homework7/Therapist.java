package Homework7;

public class Therapist extends Doctor {

    @Override
    public void treat() {
        System.out.println("Терапевт: назначаю общее лечение.");
    }

    public void assignDoctor(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1 -> patient.setDoctor(new Surgeon()); // хирург
            case 2 -> patient.setDoctor(new Dentist()); // дантист
            default -> patient.setDoctor(new Therapist()); // терапевт


        }
    }
}
