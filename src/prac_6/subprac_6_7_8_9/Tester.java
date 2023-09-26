package prac_6.subprac_6_7_8_9;

public class Tester {
    public static void main(String[] args) {
        int size = 4;
        Printable arr[] = new Printable[size];
        arr[0] = new Book("Don Quixote", 100);
        arr[1] = new Book("The Great Gatsby", 150);
        arr[2] = new Shop("Pyaterochka", 4);
        arr[3] = new Shop("Perekrestok", 5);

        for (int i = 0; i < size; i++) {
            arr[i].print();
        }
    }
}
