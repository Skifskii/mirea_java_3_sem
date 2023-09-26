package prac_6.subprac_11;

public class Tester {
    public static void main(String[] args) {
        Temperature t = new Temperature("Кельвин", 300);

        System.out.println("Цельсий: " + t.convert("Цельсий"));
        System.out.println("Кельвин: " + t.convert("Кельвин"));
        System.out.println("Фаренгейт: " + t.convert("Фаренгейт"));
    }
}
