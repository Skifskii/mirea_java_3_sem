package prac_3.format.subprac_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
