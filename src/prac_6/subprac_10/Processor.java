package prac_6.subprac_10;

public class Processor {
    private final String model;
    private final int megabytesOfCache;

    public Processor(String model, int megabytesOfCache) {
        this.model = model;
        this.megabytesOfCache = megabytesOfCache;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", megabytesOfCache=" + megabytesOfCache +
                '}';
    }
}
