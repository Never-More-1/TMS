package I.good;

public class Swimmer implements Swim{
    @Override
    public void swim(){
        System.out.println("Я могу плавать!");
    }
}
//Этот код соответствует принципу разделения интерфейсов,
//т.к. все абстрактные методы имплементируемые в классе используются.