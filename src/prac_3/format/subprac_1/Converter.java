package prac_3.format.subprac_1;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    private final double value; // dollar

    public Converter(int value) {
        this.value = value;
    }

    public String getDollar() {
        NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);
        return dollar.format(value);
    }

    public String getEuro() {
        NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return euro.format(0.93 * value);
    }

    public String getYuan() {
        NumberFormat yuan = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return yuan.format(7.29 * value);
    }
}

