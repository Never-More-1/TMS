package factory;

public class BarsicFactory extends CatFactory{
    @Override
    public Cat setName() {
        return new Barsic();
    }
}
