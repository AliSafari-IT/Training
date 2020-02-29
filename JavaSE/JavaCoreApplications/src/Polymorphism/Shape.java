package Polymorphism;

/**
 *
 * @author Ali
 */
public class Shape {

    public String what() {
        return "Shape ";
    }

    public static void main(String[] args) {

        Shape[] shapes;
        Oval oval = new Oval();
        Rectangle rectangle = new Rectangle();
        Square square =new Square();
        Circle circle = new Circle();
        shapes = new Shape[]{oval, rectangle, square, circle};
        for (Shape s : shapes) {
            System.out.print(s.what() + " ");
        }
    }
}
