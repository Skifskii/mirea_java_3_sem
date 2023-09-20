package prac_4_1.subprac_10;

public abstract class Transport {
    protected double speed;
    protected double price_per_km;

    public Transport(double speed, double price_per_km) {
        this.speed = speed;
        this.price_per_km = price_per_km;
    }

    abstract double getTime(int length);
    abstract double getPrice(int length);
}
