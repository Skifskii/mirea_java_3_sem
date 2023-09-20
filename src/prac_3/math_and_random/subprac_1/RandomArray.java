package prac_3.math_and_random.subprac_1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int array_size = 5;
        double[] array_class_random = new double[array_size];
        double[] array_method_random = new double[array_size];

        Random rand = new Random();
        for (int i=0; i<array_size; i++) {
            array_class_random[i] = rand.nextDouble();
            array_method_random[i] = Math.random();
        }

        System.out.println("Класс Random: " + Arrays.toString(array_class_random));
        System.out.println("Метод random() класса Math: " + Arrays.toString(array_method_random));
    }
}
