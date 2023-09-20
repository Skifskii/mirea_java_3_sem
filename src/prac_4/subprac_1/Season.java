package prac_4.subprac_1;

public enum Season {
    WINTER(-10),
    SPRING(14),
    SUMMER(25),
    AUTUMN(15);

    private final int avg_temperature;
    private final String description;
    private Season(int avg_temperature) {
        this.avg_temperature = avg_temperature;
        switch (avg_temperature) {
            case -10 -> this.description = "Холодное время года";
            case 25 -> this.description = "Теплое время года";
            case 14, 15 -> this.description = "Среднее время года";
            default -> this.description = "";
        }
    }

    public String getDescription() {
        return description;
    }

    public int getAvg_temperature() {
        return avg_temperature;
    }
}
