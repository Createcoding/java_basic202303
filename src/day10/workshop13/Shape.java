package day10.workshop13;


public abstract class Shape {
    private Point point;
    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    public abstract double getArea();
    public abstract double getCircumference();

}
