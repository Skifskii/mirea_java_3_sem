package prac_4_1.subprac_8;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(6.0);
        System.out.println(circle.toString() + "\n" +
                "\tПлощадь: " + circle.getArea() + "\n" +
                "\tПериметр: " + circle.getPerimeter() + "\n");

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle.toString() + "\n" +
                "\tПлощадь: " + rectangle.getArea() + "\n" +
                "\tПериметр: " + rectangle.getPerimeter() + "\n");

        Square square = new Square(5.0);
        System.out.println(square.toString() + "\n" +
                "\tПлощадь: " + square.getArea() + "\n" +
                "\tПериметр: " + square.getPerimeter() + "\n");


    }
}
