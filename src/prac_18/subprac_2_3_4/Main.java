package prac_18.subprac_2_3_4;

import java.util.Scanner;
class Exception2 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат деления: " + 2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный формат данных");
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");
        }
        catch (Exception e) {
            System.out.println("Неизвестная ошибка");
        }
        finally {
            System.out.println("Конец");
        }
    }
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}


