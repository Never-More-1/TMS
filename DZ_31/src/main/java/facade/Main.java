package facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
        System.out.println("Работа с приложениями...\n");
        computer.shutdownComputer();
    }
}
//Фасад — это структурный паттерн, который предоставляет простой (но урезанный)
//интерфейс к сложной системе объектов, библиотеке или фреймворку.