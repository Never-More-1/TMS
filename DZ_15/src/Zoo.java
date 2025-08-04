import java.util.ArrayDeque;

public class Zoo {
    public ArrayDeque<String> animals = new ArrayDeque<>();

    Zoo() {
        animals.offerLast("Zebra");
        animals.offerLast("Elephant");
        animals.offerLast("Monkey");
        animals.offerLast("Hippo");
    }

    public void addAnimal(String animal) {

        animals.push(animal);
    }

    public void deleteAnimal() {
        animals.removeLast();
    }
}
