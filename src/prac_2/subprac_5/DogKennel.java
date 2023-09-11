package prac_2.subprac_5;

import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        int kennel_size = 0;
        System.out.print("Введите вместимоть питомника: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            kennel_size = sc.nextInt();
        }
        Dog[] kennel = new Dog[kennel_size];

        String name = "";
        int age = 0;
        for (int i=0; i<kennel_size; i++) {
            System.out.print((i+1) + ") ");
            System.out.print("Имя собаки: ");
            name = sc.next();
            System.out.print("   Возраст собаки: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
            }

            kennel[i] = new Dog(name, age);
        }
        System.out.println("\n\nИнформация о собаке №1:\n" +
                kennel[0] + "\n" +
                "Человеческий возраст: " + kennel[0].ageTranslator());
    }
}
