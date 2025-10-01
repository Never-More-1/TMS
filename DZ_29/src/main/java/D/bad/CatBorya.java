package D.bad;

public class CatBorya {
    private CatSound sound;

    public CatBorya() {
        this.sound = new CatSound();
    }

    public String speak() {
        return sound.makeSound();
    }
}
//Этот код не соответствует принципу инверсии зависимостей, т.к. класс верхнего уровня
//CatBorya напрямую зависит от класса нижнего уровня CatSound, а не от абстракции Sound.
//Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.