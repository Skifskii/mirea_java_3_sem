package prac_1;

import java.util.Scanner;

public class Main {
    static int[] fill_array(int array_size, Scanner sc) {
        int[] arr = new int[array_size];
        for (int i=0; i<array_size; i++) {
            System.out.print("arr[" + i + "] = ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void subtask_3(Scanner sc) {
        int size = 0;
        System.out.print("Размер массива: ");
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        else {
            System.out.println("Ошибка. Вы ввели не целое число");
            return;
        }
        int[] arr = fill_array(size, sc);
        int summa = 0;
        for (int i=0; i<size; i++) {
            summa += arr[i];
        }
        System.out.println("- Сумма элементов: " + summa);
        System.out.println("- Среднее арифметическое: " + (summa / size) + "\n");
    }

    public static void subtask_4(Scanner sc) {
        int size = 0;
        System.out.print("Размер массива: ");
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        else {
            System.out.println("Ошибка. Вы ввели не целое число");
            return;
        }
        int[] arr = fill_array(size, sc);
        int while_summa = 0;
        int do_while_summa = 0;

        int i = 0;
        int max_element = arr[0];
        while (i < size) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }
            while_summa += arr[i];
            i++;
        }
        i = 0;
        int min_element = arr[i];
        do {
            if (arr[i] < min_element) {
                min_element = arr[i];
            }
            do_while_summa += arr[i];
            i++;
        } while (i < size);
        System.out.println("- Сумма (посчитана при помощи while): " + while_summa);
        System.out.println("- Сумма (посчитана при помощи do while): " + do_while_summa);
        System.out.println("- Максимальный элемент: " + max_element);
        System.out.println("- Минимальный элемент: " + min_element + "\n");
    }

    public static void subtask_6() {
        System.out.println("Гармонический ряд:");
        for (double i=1; i<=10; i++) {
            System.out.println((int)i + ") " + 1 / i);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Практическая работа №1 =====\n");
            System.out.println("Выберите подзадачу:");
            System.out.println("3) Написать программу, в результате которой массив чисел создается с\n" +
                    "помощью инициализации (как в Си) вводится и считается в цикле сумма\n" +
                    "элементов целочисленного массива, а также среднее арифметическое его\n" +
                    "элементов результат выводится на экран. Использовать цикл for.");
            System.out.println("4) Написать программу, в результате которой массив чисел вводится\n" +
                    "пользователем с клавиатуры считается сумма элементов целочисленного\n" +
                    "массива с помощью циклов do while, while, также необходимо найти\n" +
                    "максимальный и минимальный элемент в массиве, результат выводится на экран.");
            System.out.println("6) Написать программу, в результате работы которой выводятся на экран\n" +
                    "первые 10 чисел гармонического ряда (форматировать вывод).\n");
            System.out.print("Номер подзадачи: ");
            int subtask_number = 0;
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                subtask_number = sc.nextInt();
            }
            if (subtask_number == 3) {
                subtask_3(sc);
            }
            else if (subtask_number == 4) {
                subtask_4(sc);
            }
            else if (subtask_number == 6) {
                subtask_6();
            }
            else {
                System.out.println("Такой подзадачи не существует. Завершение программы...");
                return;
            }
        }
    }
}
