package facade;

class CPU {
    public void start() {
        System.out.println("CPU: Запуск процессора");
    }

    public void execute() {
        System.out.println("CPU: Выполнение инструкций");
    }

    public void shutdown() {
        System.out.println("CPU: Остановка процессора");
    }
}
