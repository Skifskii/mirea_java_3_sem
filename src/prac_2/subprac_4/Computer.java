package prac_2.subprac_4;

public class Computer {
    private final String name;
    private final int price;

    public Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name=" + name + ", " +
                "price=" + price +
                "}";
    }
}
