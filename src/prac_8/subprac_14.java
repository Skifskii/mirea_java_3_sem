package prac_8;

import java.util.Scanner;

public class subprac_14 {
    public static void recursion(int number) {
        if (number <= 0) {
            return;
        }
        recursion(number / 10);
        System.out.print(number % 10 + " ");
    }

    public static void main(String[] args) {
        recursion(12345);
    }
}
