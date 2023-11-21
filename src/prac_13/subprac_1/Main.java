package prac_13.subprac_1;

public class Main {
    public static void takeSomeString(String s) {
        System.out.println("2. " + s.charAt(s.length() - 1));
        System.out.println("3. " + s.endsWith("!!!"));
        System.out.println("4. " + s.startsWith("I like"));
        System.out.println("5. " + s.contains("Java"));
        System.out.println("6. " + s.indexOf("Java"));
        System.out.println("7. " + s.replace('a', '0'));
        System.out.println("8. " + s.toUpperCase());
        System.out.println("9. " + s.toLowerCase());
        System.out.println("10. " + s.substring(7, 11));
    }

    public static void main(String[] args) {
        takeSomeString("I like Java!!!");
    }
}
