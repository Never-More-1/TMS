package abstractFactory;

class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Отрисовка кнопки в стиле MacOS");
    }

    @Override
    public void onClick() {
        System.out.println("Нажатие на MacOS кнопку");
    }
}
