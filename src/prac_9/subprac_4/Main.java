package prac_9.subprac_4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 100);
        Car car2 = new Car("Mercedes", 200);

        System.out.println(car1.compareTo(car2));
    }
}
