package prac_4_1.subprac_2;

public class Tester {
    public static void main(String[] args) {
        // 1.
        Phone phone_1 = new Phone(1, "Samsung", 12.8);
        Phone phone_2 = new Phone(2, "Iphone", 13.2);
        Phone phone_3 = new Phone(3, "Xiaomi", 10.4);

        // 2.
        System.out.println(phone_1.toString());
        System.out.println(phone_2.toString());
        System.out.println(phone_3.toString());

        // 6.
        System.out.print(phone_1.getNumber() + ": ");
        phone_1.receiveCall("Misha");
        System.out.print(phone_2.getNumber() + ": ");
        phone_2.receiveCall("Vova");
        System.out.print(phone_3.getNumber() + ": ");
        phone_3.receiveCall("Kirill");

        // 12.
        phone_1.receiveCall("Andrew", 4);

        // 14.
        phone_1.sendMessage(4, 5, 6, 7);
    }
}
