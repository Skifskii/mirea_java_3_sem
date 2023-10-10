package prac_9.subprac_4;

public class Car implements Comparable<Car> {
    private final String model;
    private final int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return price - o.price;
    }
}
