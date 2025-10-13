package abstractFactory;

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Отрисовка чекбокса в стиле Windows");
    }

    @Override
    public void onCheck() {
        System.out.println("Изменение состояния Windows чекбокса");
    }
}
