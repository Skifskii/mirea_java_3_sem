package prac_5.subprac_2;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}
