package facade;

class ComputerFacade {
    private CPU cpu;
    private Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        cpu.execute();
        System.out.println("Компьютер готов к работе!\n");
    }

    public void shutdownComputer() {
        memory.free();
        cpu.shutdown();
        System.out.println("Компьютер выключен!\n");
    }
}
