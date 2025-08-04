public class Task2 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        String animal = "Wolf";
        zoo.addAnimal(animal);
        zoo.deleteAnimal();
        System.out.println(zoo.animals);
    }
}
