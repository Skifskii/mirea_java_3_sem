package prac_6.subprac_10;

public class Computer {
    private final ComputerName name;
    private final int price;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerName name, int price, String processorModel, int megabytesOfCache, String memoryModel, int gigabytes, String monitorModel, int hz) {
        this.name = name;
        this.price = price;
        this.processor = new Processor(processorModel, megabytesOfCache);
        this.memory = new Memory(memoryModel, gigabytes);
        this.monitor = new Monitor(monitorModel, hz);
    }
    public ComputerName getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                '}';
    }
}
