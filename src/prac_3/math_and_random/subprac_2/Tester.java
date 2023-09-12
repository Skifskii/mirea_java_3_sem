package prac_3.math_and_random.subprac_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    public static Circle getMinCircle(Circle[] circles) {
        Circle min_circle = circles[0];
        for (int i=1; i<circles.length; i++) {
            if (circles[i].getRadius() < min_circle.getRadius()) {
                min_circle = circles[i];
            }
        }
        return min_circle;
    }

    public static Circle getMaxCircle(Circle[] circles) {
        Circle max_circle = circles[0];
        for (int i=1; i<circles.length; i++) {
            if (circles[i].getRadius() > max_circle.getRadius()) {
                max_circle = circles[i];
            }
        }
        return max_circle;
    }

    public static Circle[] sortCircles(Circle[] circles) {
        Arrays.sort(circles, Comparator.comparing(Circle::getRadius));
        return circles;
    }

    public static void main(String[] args) {
        int number_of_circles = 3;
        Circle[] circles = new Circle[number_of_circles];

        Random rand = new Random();
        for (int i=0; i<number_of_circles; i++) {
            circles[i] = new Circle(
                    new Point(
                            rand.nextInt(1000),
                            rand.nextInt(1000)),
                    rand.nextInt(1000));
        }

        Circle min_circle = getMinCircle(circles);
        System.out.println(
                "Самая маленькая окружность:\n" +
                "\tЦентр: " + (min_circle.getCenter().toString()) + "\n" +
                "\tРадиус: " + (min_circle.getRadius()) + "\n" +
                "\tДлина окружности: " + min_circle.getLength() + "\n"
        );

        Circle max_circle = getMaxCircle(circles);
        System.out.println(
                "Самая большая окружность:\n" +
                        "\tЦентр: " + (max_circle.getCenter().toString()) + "\n" +
                        "\tРадиус: " + (max_circle.getRadius()) + "\n" +
                        "\tДлина окружности: " + max_circle.getLength() + "\n"
        );

        System.out.println("Массив до сортировки: " + Arrays.toString(circles));
        System.out.println("Массив после сортировки: " + Arrays.toString(sortCircles(circles)));
    }
}
