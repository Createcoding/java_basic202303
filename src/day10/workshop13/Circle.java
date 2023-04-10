package day10.workshop13;

public class Circle extends Shape implements Movable {

    private int radius;
    private static final double PI = 3.14159246;

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getCircumference() {
        return radius * 2 * PI;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        Point cirPoint = new Point(x, y);
    }
    @Override
    public void move(int x, int y) {
//        this(4,4,6);
    }
}
