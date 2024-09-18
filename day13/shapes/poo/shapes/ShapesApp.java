package day13.shapes.poo.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        System.out.println("Shapes!");

        Shape c1 = new Circle(11, 22, 4);
        Shape c2 = new Circle(6, 5, 8);

        Shape r1 = new Rectangle(6, 5, 3, 2);
        Shape r2 = new Rectangle(60, 15, 23, 25);

        //Shape[] shapes = {c1, c2, r1, r2};

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());

        Circle c3 = (Circle)c1;
        Circle c4 = (Circle)c1;
        System.out.println(c3.intersect(c4));
        System.out.println(c2.intersect(c1));

        System.out.println(c1.intersect(r2));
        System.out.println(r2.intersect(c1));

    }
}
