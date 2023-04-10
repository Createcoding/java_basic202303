package day10.workshop13;

public class Rectangle extends Shape implements Movable {
    private int width;

    public Rectangle() {

    }

    @Override
    public double getArea() {

        return width * width;
    }

    @Override
    public double getCircumference() {
        return width * 4;
    }

    public Rectangle(int width,int x,int y) {
        this.width = width;
        Point recPoint = new Point(x, y);
    }


    @Override
    public void move(int x, int y) {

    }
}
