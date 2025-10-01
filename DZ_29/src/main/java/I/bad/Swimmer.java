package I.bad;

public class Swimmer implements Moves{
    @Override
    public void swim(){
        System.out.println("Я могу плавать!");
    }

    @Override
    public void punch(){
        System.out.println("Я не могу бить!");
    }

    @Override
    public void jump(){
        System.out.println("Я не могу прыгать!");
    }
}
//Этот код не соответствует принципу разделения интерфейсов, т.к. не все абстрактные методы имплементируемые
//в классе используются.
//Не следует ставить клиент в зависимость от методов, которые он не использует.
