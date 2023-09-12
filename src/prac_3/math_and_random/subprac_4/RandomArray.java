package prac_3.math_and_random.subprac_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите натуральное число: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            if (n > 0) {
                break;
            }
            System.out.println("Число должно быть больше нуля!");
        }

        int[] arr = new int[n];
        ArrayList<Integer> even_arr = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<n; i++) {
            int random_number = rand.nextInt(n+1);
            arr[i] = random_number;
            if (random_number % 2 == 0) {
                even_arr.add(random_number);
            }
        }

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Четные элементы: " + even_arr);
    }
}
