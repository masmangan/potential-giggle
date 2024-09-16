package day13.shapes.poo.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        System.out.println("Shapes!");

        Circle c1 = new Circle(11, 22, 4);
        Circle c2 = new Circle(6, 5, 8);

        Rectangle r1 = new Rectangle(6, 5, 3, 2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());

        System.out.println(c1.intersect(c2));
        System.out.println(c2.intersect(c1));

    }
}
