package abstractFactory;

class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Отрисовка чекбокса в стиле MacOS");
    }

    @Override
    public void onCheck() {
        System.out.println("Изменение состояния MacOS чекбокса");
    }
}
