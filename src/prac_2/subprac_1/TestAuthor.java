package prac_2.subprac_1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author test_author = new Author("Peter", "peter@gmail.com", 'm');
        System.out.println("Имя автора: " + test_author.getName());
        Scanner sc = new Scanner(System.in);
        String email = "";
        System.out.print("Введите email: ");
        email = sc.next();
        test_author.setEmail(email);
    }
}

