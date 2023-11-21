package prac_11.subprac_4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.print("<Год> <Месяц> <Число>: ");
        date.setYear(sc.nextInt() - 1900);
        date.setMonth(sc.nextInt() - 1);
        date.setDate(sc.nextInt());

        System.out.print("<Часы1> <минуты>: ");
        date.setHours(sc.nextInt());
        date.setMinutes(sc.nextInt());

        System.out.println(sdf.format(date.getTime()));
    }
}
