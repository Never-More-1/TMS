package D.good;

public class CatBorya {
    private Sound sound;

    public CatBorya(Sound sound) {
        this.sound = sound;
    }

    public String speak() {
        return sound.makeSound();
    }
}
//Этот код соответствует принципу разделения интерфейсов,
// т.к. класс верхнего уровня CatBorya напрямую зависит от от абстракции Sound.