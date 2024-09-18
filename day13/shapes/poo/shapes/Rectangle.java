package day13.shapes.poo.shapes;

public class Rectangle extends Shape {


    private int base;
    private int height;

    public Rectangle(int x, int y, int base, int height) {
        //this.x = x;
        //this.y = y;
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * (base + height);
    }

    public boolean intersect(Shape s) {
        if (s instanceof Circle) {
            System.out.println("Intersect retangulo e circulo");        
        } else if (s instanceof Rectangle) {
            System.out.println("Intersect retangulo e retangulo");        
        } else {
            System.out.println("Intersect retangulo e shape");        
        }
        return false;
    }    

    @Override
    public String toString() {
        return super.toString() +
         String.format(" x=%d y=%d base=%d height=%d", 
         x, y, base, height);
    }    
}
