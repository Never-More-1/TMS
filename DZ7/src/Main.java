import java.lang.reflect.Field;

//TODO реализовать изменение цвета через рефликсию
public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Patient patient = new Patient();
        patient.setTreatmentPlan(1);

        Therapist therapist = new Therapist();
        therapist.plan(patient);

        Doctor doctor = patient.getDoctor();
        doctor.treatment();

        Apple apple = new Apple();
        apple.сolour();

        Field field = Apple.class.getDeclaredField("colour");
        field.setAccessible(true);
        field.set(apple, "красное");

        apple.colour();
        //пытался реализовать через рефлексию, но что-то пошло не так. В 22 строке выдает ошибку:
        //'colour' has private access in 'Apple'
    }
}