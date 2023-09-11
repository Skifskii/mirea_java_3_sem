package prac_2.subprac_4;


import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        String computer_name = "";
        int computer_price = 0;
        Computer computer;

        while (true) {
            System.out.print("--- Shop ---\n" +
                    "Выберите действие:\n" +
                    "1) Добавить компьютер\n" +
                    "2) Удалить компьютер\n" +
                    "3) Найти компьютер\n" +
                    "Действие: ");
            int action_number = 0;
            if (sc.hasNextInt()) {
                action_number = sc.nextInt();
            }
            switch (action_number) {
                case (1):

                    System.out.print("Введите название компьютера: ");
                    computer_name = sc.next();

                    computer = shop.getComputer(computer_name);
                    if (computer != null) {
                        System.out.println("Такой компьютер уже есть!\n");
                        break;
                    }

                    System.out.print("Введите цену компьютера: ");
                    if (sc.hasNextInt()) {
                        computer_price = sc.nextInt();
                    }

                    shop.addComputer(new Computer(computer_name, computer_price));

                    System.out.println("Компьютер успешно добавлен!\n");
                    break;

                case (2):
                    System.out.print("Введите имя компьютера: ");
                    computer_name = sc.next();
                    computer = shop.getComputer(computer_name);
                    if (computer != null) {
                        shop.deleteComputer(computer);
                        System.out.println("Компьютер успешно удален!");
                    }
                    else {
                        System.out.println("Такого компьютера не существует!");
                    }
                    System.out.print("\n");
                    break;

                case (3):
                    System.out.print("Введите имя компьютера: ");
                    computer_name = sc.next();
                    computer = shop.getComputer(computer_name);
                    if (computer != null) {
                        System.out.println(computer);
                    }
                    else {
                        System.out.println("Такого компьютера не существует!");
                    }
                    System.out.print("\n");
                    break;
            }
        }
    }
}
