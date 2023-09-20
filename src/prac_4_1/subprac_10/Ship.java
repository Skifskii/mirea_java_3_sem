package prac_4_1.subprac_10;

public class Ship extends Transport {
    private int age;

    public Ship(int speed, int price_per_km, int age) {
        super(speed, price_per_km);
        this.age = age;
    }

    public double getTime(int length) {
        return ((double)length / (double)this.speed) * (double)age;
    }

    public double getPrice(int length) {
        return length * 4;
    }
}
