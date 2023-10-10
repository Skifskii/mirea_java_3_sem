package prac_8;

import java.util.Scanner;

public class Main {
    public static void recursion() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        recursion();
    }

    public static void main(String[] args) {
        recursion();
    }
}
