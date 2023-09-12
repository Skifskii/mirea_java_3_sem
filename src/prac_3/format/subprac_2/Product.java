package prac_3.format.subprac_2;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDollar() {
        NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);
        return dollar.format(price);
    }

    public String getEuro() {
        NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return euro.format(0.93 * price);
    }

    public String getYuan() {
        NumberFormat yuan = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return yuan.format(7.29 * price);
    }
}
