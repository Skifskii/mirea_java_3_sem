package prac_14.subprac_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";

        String regex = "^(abcdefghijklmnopqrstuv18340)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.matches());
    }
}
