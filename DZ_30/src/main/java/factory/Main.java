package factory;

public class Main {
    public static void main(String[] args) {
        CatFactory barsicFactory = new BarsicFactory();
        CatFactory slanecFactory = new SlanecFactory();

        System.out.println("Мой первый кот " + barsicFactory.setName().getInfo());
        System.out.println("Мой второй кот " + slanecFactory.setName().getInfo());
    }
}
//С котами неудачный пример, лучше было бы с машинами или телефонами
//Фабричный метод — это порождающий паттерн проектирования,
//который определяет общий интерфейс для создания объектов в суперклассе,
//позволяя подклассам изменять тип создаваемых объектов.