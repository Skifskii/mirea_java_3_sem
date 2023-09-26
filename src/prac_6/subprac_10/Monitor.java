package prac_6.subprac_10;

public class Monitor {
    private final String model;
    private final int hz;

    public Monitor(String model, int hz) {
        this.model = model;
        this.hz = hz;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", hz=" + hz +
                '}';
    }
}
