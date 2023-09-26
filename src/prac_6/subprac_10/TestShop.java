package prac_6.subprac_10;


import java.util.Scanner;

public class TestShop {
    public static ComputerName getEnumComputerName(String computerNameStr) {
        switch (computerNameStr) {
            case ("B") -> {
                return ComputerName.B;
            }
            case ("C") -> {
                return ComputerName.C;
            }
            case ("D") -> {
                return ComputerName.D;
            }
            default -> {
                return ComputerName.A;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        String computerNameStr = "";
        ComputerName computerName = ComputerName.A;
        int computer_price = 0;
        Computer computer;
        String processorModel = "";
        int megabytesOfCache = 0;
        String memoryModel = "";
        int gigabytes = 0;
        String monitorModel = "";
        int hz = 0;

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

                    System.out.print("Введите название компьютера (A, B, C или D): ");
                    computerNameStr = sc.next();
                    computerName = getEnumComputerName(computerNameStr);

                    computer = shop.getComputer(computerName);
                    if (computer != null) {
                        System.out.println("Такой компьютер уже есть!\n");
                        break;
                    }

                    System.out.print("Введите цену компьютера: ");
                    if (sc.hasNextInt()) {
                        computer_price = sc.nextInt();
                    }

                    System.out.print("Введите модель процессора: ");
                    processorModel = sc.next();

                    System.out.print("Введите количество мегабайт кеша процессора: ");
                    if (sc.hasNextInt()) {
                        megabytesOfCache = sc.nextInt();
                    }

                    System.out.print("Введите модель памяти: ");
                    processorModel = sc.next();

                    System.out.print("Введите количество гигабайт памяти: ");
                    if (sc.hasNextInt()) {
                        gigabytes = sc.nextInt();
                    }

                    System.out.print("Введите модель монитора: ");
                    monitorModel = sc.next();

                    System.out.print("Введите количество герц монитора: ");
                    if (sc.hasNextInt()) {
                        hz = sc.nextInt();
                    }

                    shop.addComputer(new Computer(computerName, computer_price, processorModel, megabytesOfCache, memoryModel, gigabytes, monitorModel, hz));

                    System.out.println("Компьютер успешно добавлен!\n");
                    break;

                case (2):
                    System.out.print("Введите имя компьютера: ");
                    computerNameStr = sc.next();
                    computerName = getEnumComputerName(computerNameStr);
                    computer = shop.getComputer(computerName);
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
                    computerNameStr = sc.next();
                    computerName = getEnumComputerName(computerNameStr);
                    computer = shop.getComputer(computerName);

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
