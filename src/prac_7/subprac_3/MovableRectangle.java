package prac_7.subprac_3;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        this.topLeft = new MovablePoint(x1, y1, x1Speed, y1Speed);
        this.bottomRight = new MovablePoint(x2, y2, x2Speed, y2Speed);
    }


    public boolean speedTest() {
        return this.topLeft.getxSpeed() == this.bottomRight.getxSpeed() & this.topLeft.getySpeed() == this.bottomRight.getySpeed();
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
