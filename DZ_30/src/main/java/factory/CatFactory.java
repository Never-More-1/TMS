package factory;

public abstract class CatFactory {
    public abstract Cat setName();

    public void pickCat(){
        Cat cat = setName();
        System.out.println(cat.getInfo());
    }
}