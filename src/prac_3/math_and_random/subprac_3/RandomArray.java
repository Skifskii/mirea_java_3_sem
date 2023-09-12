package prac_3.math_and_random.subprac_3;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static boolean isIncreasing(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array_size = 4;
        int[] arr = new int[array_size];
        Random rand = new Random();
        for (int i=0; i<array_size; i++) {
            arr[i] = rand.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(arr));
        if (isIncreasing(arr)) {
            System.out.println("Последовательность является строго возрастающей");
        }
        else {
            System.out.println("Последовательность НЕ является строго возрастающей");
        }
    }
}
