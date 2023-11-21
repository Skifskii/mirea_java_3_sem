package prac_11.subprac_3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(104);
        date.setMonth(10);
        date.setDate(1);

        Student student = new Student("Peter", date);
        System.out.println(student);
    }
}
