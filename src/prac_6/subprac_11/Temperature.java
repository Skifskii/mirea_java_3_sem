package prac_6.subprac_11;

public class Temperature implements Convertable {
    public double value;

    public Temperature(String scale, int value) {
        switch (scale) {
            case ("Кельвин") -> this.value = value - 273.15;
            case ("Фаренгейт") -> this.value = (value - 32) * (5.0/9.0);
            default -> this.value = value;
        }
    }

    public double convert(String scale) {
        switch (scale) {
            case ("Кельвин") -> {
                return this.value + 273.15;
            }
            case ("Фаренгейт") -> {
                return (this.value * (9.0/5.0)) + 32;
            }
            default -> {
                return this.value;
            }
        }
    }
}
