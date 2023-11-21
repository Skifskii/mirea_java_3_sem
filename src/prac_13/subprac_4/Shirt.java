package prac_13.subprac_4;

public class Shirt {
    private String vendor;
    private String name;
    private String color;
    private String size;

    public Shirt(String vendor, String name, String color, String size) {
        this.vendor = vendor;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" + '\n' +
                "   vendor='" + vendor + '\'' + ",\n" +
                "   name='" + name + '\'' + ",\n" +
                "   color='" + color + '\'' + ",\n" +
                "   size='" + size + '\'' + "\n" +
                '}';
    }
}
