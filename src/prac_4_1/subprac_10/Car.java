package prac_4_1.subprac_10;

public class Car extends Transport {
    private int number_of_stops;

    public Car(int speed, int price_per_km, int number_of_stops) {
        super(speed, price_per_km);
        this.number_of_stops = number_of_stops;
    }

    public double getTime(int length) {
        return ((double)length / (double)this.speed) + 5.0 * number_of_stops;
    }

    public double getPrice(int length) {
        return length;
    }
}
