package prac_7.subprac_3;

public class Tester {
    public static void main(String[] args) {
        MovableRectangle rc = new MovableRectangle(1, 1, 3, 3, 6, 7, 6, 7);
        System.out.println(rc);
        System.out.println("speedTest(): " + rc.speedTest());
    }
}
