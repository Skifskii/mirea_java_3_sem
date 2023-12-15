package prac_14.subprac_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "a123@@ya.ru";
        String pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        System.out.println(m.matches());
    }
}
