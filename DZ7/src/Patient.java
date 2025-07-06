public class Patient {
    private int treatmentMethod;
    private Doctor doctor;

    public int getTreatmentPlan() {
        return treatmentMethod;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentMethod = treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor assignedDoctor) {
        this.doctor = assignedDoctor;
    }
}
