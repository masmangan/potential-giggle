package day13.shapes.poo.shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        //this.x = 0;
        //this.y = 0;
        //this.radius = radius;
        this(0, 0, radius);
    }

    public Circle(int x, int y, int radius) {
        //this.x = x;
        //this.y = y;
        super(x, y);
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

    public boolean intersect(Circle c) {
        System.out.println("Intersect círculo e círculo");
        return false;
    }

    public boolean intersect(Shape c) {
        System.out.println("Intersect círculo e shape");
        return false;
    }
}
