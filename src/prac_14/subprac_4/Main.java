package prac_14.subprac_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "(1+8)–9/4";

        String regex = "\\u002B\\d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.find());
    }
}
