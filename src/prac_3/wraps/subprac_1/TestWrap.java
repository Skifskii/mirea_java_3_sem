package prac_3.wraps.subprac_1;

public class TestWrap {
    public static void main(String[] args) {
        // 1.
        Double a =  Double.valueOf(5.1);

        // 2.
        Double b = Double.parseDouble("5");

        // 3.
        byte byte_a = b.byteValue();
        short short_a = b.shortValue();
        int int_a = b.intValue();
        long long_a = b.longValue();
        float float_a = b.floatValue();

        // 4.
        System.out.println("byte: " + byte_a);
        System.out.println("short: " + short_a);
        System.out.println("int: " + int_a);
        System.out.println("long: " + long_a);
        System.out.println("float: " + float_a);

        // 5.
        String c = Double.toString(3.14);
        System.out.println("String: " + c);
    }
}
