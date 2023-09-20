package prac_4_1.subprac_10;

public class Train extends Transport {
    private int number_of_carriages;

    public Train(int speed, int price_per_km, int number_of_carriages) {
        super(speed, price_per_km);
        this.number_of_carriages = number_of_carriages;
    }

    public double getTime(int length) {
        return ((double)length / (double)this.speed) + number_of_carriages + 1;
    }

    public double getPrice(int length) {
        return length * 3;
    }
}
