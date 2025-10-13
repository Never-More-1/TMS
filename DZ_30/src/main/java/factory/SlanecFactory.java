package factory;

public class SlanecFactory extends CatFactory{
    @Override
    public Cat setName() {
        return new Slanec();
    }
}
