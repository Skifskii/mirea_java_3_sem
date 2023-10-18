package prac_8;

import java.util.Scanner;

public class subprac_13 {
    public static void recursion(boolean is_odd) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return;
        }
        if (is_odd) {
            System.out.println(n);
        }
        recursion(!is_odd);
    }

    public static void main(String[] args) {
        recursion(true);
    }
}
