package prac_5.subprac_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Interface extends JPanel {
    private static final int WINDOW_WIDTH = 700;
    private static final int WINDOW_HEIGHT = 700;

    private static final int MAX_SHAPES = 20;
    private static final int MAX_SIZE = 200;
    private static final int MIN_SIZE = 20;

    private Shape[] shapes;

    public Interface() {
        shapes = new Shape[MAX_SHAPES];
        Random random = new Random();

        for (int i = 0; i < MAX_SHAPES; i++) {
            int x = random.nextInt(WINDOW_WIDTH - MAX_SIZE);
            int y = random.nextInt(WINDOW_HEIGHT - MAX_SIZE);
            int width = random.nextInt(MIN_SIZE, MAX_SIZE);
            int height = random.nextInt(MIN_SIZE, MAX_SIZE);
            int radius = random.nextInt(MIN_SIZE / 2, MAX_SIZE / 2) + 1;

            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                shapes[i] = new Rectangle(color, x, y, width, height);
            } else {
                shapes[i] = new Circle(color, x, y, radius);
            }
        }

        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    }

    public void paintComponent(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Interface());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
