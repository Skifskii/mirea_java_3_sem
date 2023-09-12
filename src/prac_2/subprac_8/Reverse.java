package prac_2.subprac_8;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.next();
        char[] reversed_s = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            reversed_s[s.length() - i - 1] = s.charAt(i);
        }
        System.out.print("Результат: " + Arrays.toString(reversed_s));
    }
}
