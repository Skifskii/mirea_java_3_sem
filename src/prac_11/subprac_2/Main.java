package prac_11.subprac_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static String compareDates(Date date1, Date date2) {
        if (date1.getTime() < date2.getTime()) {
            return "<";
        }
        if (date1.getTime() > date2.getTime()) {
            return ">";
        }
        return "=";
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = new Date();
//        System.out.println(sdf.format(date.getTime()));

        Date date1 = new Date();
        Scanner sc = new Scanner(System.in);

        System.out.print("Day: ");
        date1.setDate(sc.nextInt());
        System.out.print("Month: ");
        date1.setMonth(sc.nextInt() - 1);
        System.out.print("Year: ");
        date1.setYear(sc.nextInt() - 1900);
        System.out.print("Hours: ");
        date1.setHours(sc.nextInt());
        System.out.print("Minutes: ");
        date1.setMinutes(sc.nextInt());
        System.out.print("Seconds: ");
        date1.setSeconds(sc.nextInt());

        System.out.println(sdf.format(date.getTime()) + " " + compareDates(date, date1) + " " + sdf.format(date1.getTime()));

    }
}
