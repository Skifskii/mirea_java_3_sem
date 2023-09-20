package prac_4_1.subprac_10;

public class Airplane extends Transport{
    private int height;

    public Airplane(int speed, int price_per_km, int height) {
        super(speed, price_per_km);
        this.height = height;
    }

    public double getTime(int length) {
        return ((double)length / (double)this.speed) + height;
    }

    public double getPrice(int length) {
        return length * 2;
    }
}
