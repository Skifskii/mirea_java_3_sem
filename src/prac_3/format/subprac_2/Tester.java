package prac_3.format.subprac_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static String getPrice(Product product, String currency) {
        switch (currency) {
            case ("dollar"):
                return product.getDollar();
            case ("euro"):
                return product.getEuro();
            case ("yuan"):
                return product.getYuan();
        }
        return "";
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product("Milk", 1.2));
        shop.addProduct(new Product("Bread", 2.5));
        shop.addProduct(new Product("Eggs", 10.0));

        ArrayList<Product> products = shop.getProducts();
        String current_currency = "dollar";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("____________________________________");
            System.out.println("Текущая валюта: " + current_currency + "\n");

            for (int i=0; i<products.size(); i++) {
                System.out.println(products.get(i).getName() + ": " + getPrice(products.get(i), current_currency));
            }

            System.out.println("\nДоступные валюты: dollar, euro, yuan");
            System.out.print("Введите название валюты: ");
            current_currency = sc.next();
        }
    }
}
