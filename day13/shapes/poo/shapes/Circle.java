package day13.shapes.poo.shapes;

public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
         String.format(" x=%d y=%d radius=%d", x, y, radius);
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean intersect(Circle c) {
        // TODO: completar!
        return false;
    }
}
