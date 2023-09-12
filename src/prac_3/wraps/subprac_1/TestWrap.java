package prac_3.wraps.subprac_1;

public class TestWrap {
    public static void main(String[] args) {
        // 1.
        Double a =  Double.valueOf(5.1);

        // 2.
        Double b = Double.parseDouble("5");

        // 3.
        String b_str = b.toString();
        byte byte_a = Byte.parseByte(b_str);
        short short_a = Short.parseShort(b_str);
        int int_a = Integer.parseInt(b_str);
        long long_a = Long.parseLong(b_str);
        float float_a = Float.parseFloat(b_str);
        boolean boolean_a = Boolean.parseBoolean(b_str);

        System.out.println(byte_a);
        System.out.println(short_a);
        System.out.println(int_a);
        System.out.println(long_a);
        System.out.println(float_a);
        System.out.println(boolean_a);

    }
}
