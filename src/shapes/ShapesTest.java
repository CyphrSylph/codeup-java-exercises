package shapes;

public class ShapesTest {

    // Main method to test shape methods
    public static void main(String[] args) {

        // New object with instance of Rectangle class
        Rectangle box1 =  new Rectangle(4,5);

        System.out.println("Dimensions of Box1:");
        // Print out perimeter of object box1
        System.out.println("Perimeter: " + box1.getPerimeter());
        // Print out area of object box1
        System.out.println("Area: " + box1.getArea());

        // Print new line for spacing
        System.out.println();

        // New object with instance of Square class
        Rectangle box2 = new Square(5);
        System.out.println("Dimensions of Box2:");
        // Print out perimeter of object box2
        System.out.println("Perimeter: " + box2.getPerimeter());
        // Print out area of object box2
        System.out.println("Area: " + box2.getArea());

    }
}
