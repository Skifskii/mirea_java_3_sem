package prac_2.subprac_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.print("Введите несколько слов: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count_spaces = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count_spaces++;
            }
        }
        System.out.println("Количество слов: " + (count_spaces + 1));
    }
}
