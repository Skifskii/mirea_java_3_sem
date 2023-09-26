package prac_6.subprac_10;

public class Memory {
    private final String model;
    private final int gigabytes;

    public Memory(String model, int gigabytes) {
        this.model = model;
        this.gigabytes = gigabytes;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "model='" + model + '\'' +
                ", gigabytes=" + gigabytes +
                '}';
    }
}
