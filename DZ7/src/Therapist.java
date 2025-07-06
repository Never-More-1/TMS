public class Therapist extends Doctor {

    void treatment() {
        System.out.println("Терапевт приступает к работе");
    }

    void plan(Patient patient) {
        int code = patient.getTreatmentPlan();
        switch (code) {
            case 1 -> patient.setDoctor(new Surgeon());
            case 2 -> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(new Therapist());
        }
    }
}

