package Homework7;

public class Patient {
    private int treatmentPlan; // план лечения
    private Doctor doctor;     // назначенный врач

    public void treat() {
        if (doctor != null) {
            doctor.treat();
        } else {
            System.out.println("Пациенту не назначен врач.");
        }

    }

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }


}
