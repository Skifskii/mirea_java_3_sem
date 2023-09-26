package prac_6.subprac_6_7_8_9;

public class Shop implements Printable {
    private final String name;
    private final int rating;

    public Shop(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void print() {
        System.out.println("Shop{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}');
    }
}
