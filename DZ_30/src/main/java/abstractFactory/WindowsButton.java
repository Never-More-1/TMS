package abstractFactory;

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Отрисовка кнопки в стиле Windows");
    }

    @Override
    public void onClick() {
        System.out.println("Нажатие на Windows кнопку");
    }
}
