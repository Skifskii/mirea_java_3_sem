package prac_6.subprac_6_7_8_9;

public class Book implements Printable {
    private final String name;
    private final int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }
}
