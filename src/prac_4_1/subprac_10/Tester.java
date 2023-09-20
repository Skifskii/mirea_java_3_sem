package prac_4_1.subprac_10;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car(60, 100, 3);
        Airplane airplane = new Airplane(400, 1000, 1000);
        Train train = new Train(140, 250, 10);
        Ship ship = new Ship(100, 500, 2);

        int length = 30;

        System.out.println("Машина: {Время: " + car.getTime(length) + ", Стоимость: " + car.getPrice(length) + "}");
        System.out.println("Самолет: {Время: " + airplane.getTime(length) + ", Стоимость: " + airplane.getPrice(length) + "}");
        System.out.println("Поезд: {Время: " + train.getTime(length) + ", Стоимость: " + train.getPrice(length) + "}");
        System.out.println("Корабль: {Время: " + ship.getTime(length) + ", Стоимость: " + ship.getPrice(length) + "}");
    }
}
