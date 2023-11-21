package prac_11.subprac_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date date = new Date();
        date.setYear(123);
        date.setMonth(10);
        date.setDate(1);
        date.setHours(13);
        date.setMinutes(0);
        date.setSeconds(0);

        System.out.println("Lastname:\tKoreshkov");
        System.out.println("Start:\t\t" + sdf.format(date.getTime()));
        date.setHours(14);
        date.setMinutes(30);
        System.out.println("Finish:\t\t" + sdf.format(date.getTime()));
    }
}
