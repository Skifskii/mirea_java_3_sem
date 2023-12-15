package prac_14.subprac_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String date = "29/02/9999";
        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(([1-9][0-9])\\d\\d)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(date);
        System.out.println(m.matches());
    }
}

