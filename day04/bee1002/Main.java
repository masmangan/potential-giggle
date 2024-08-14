import java.util.Scanner;

class Circle {
    public static final double PI = 3.14159;
    private double radius;
    public Circle(final double radius) {
        if (radius <= 0.0)
            throw new IllegalArgumentException("O raio deve ser um valor positivo");
        this.radius = radius;
    }
    public double getArea() {
        return PI * Math.pow(radius, 2.0);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        in.close();
        Circle circle = new Circle(r);
        System.out.printf("A=%.4f%n", circle.getArea());   
    }
}