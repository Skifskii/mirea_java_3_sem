package prac_7.subprac_4;

public class MathFunc implements MathCalculable {
    public double getCircleLen(double r) {
        return 2 * MathCalculable.getPi();
    }

    public double power(double x, double power) {
        return Math.pow(x, power);
    }
    public double complex_abs(double x, double y) {
        return Math.pow((x*x + y*y), 0.5);
    }
}
