package shapes;

public class ShapesTest {

    // Main method to test shape methods
    public static void main(String[] args) {

//        //INHERITANCE & POLYMORPHISM
//
//        // New object with instance of Rectangle class
//        Rectangle box1 =  new Rectangle(4,5);
//
//        System.out.println("Dimensions of Box1:");
//        // Print out perimeter of object box1
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        // Print out area of object box1
//        System.out.println("Area: " + box1.getArea());
//
//        // Print new line for spacing
//        System.out.println();
//
//        // New object with instance of Square class
//        Rectangle box2 = new Square(5);
//        System.out.println("Dimensions of Box2:");
//        // Print out perimeter of object box2
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        // Print out area of object box2
//        System.out.println("Area: " + box2.getArea());



        // INTERFACES & ABSTRACT CLASSES

        // Variable declared with the type of Measurable
        Measurable myShape;

        // New shape object with Rectangle
        myShape = new Rectangle(4,5);
        // Print out perimeter and area of myShape
        System.out.print("The perimeter of the Rectangle shape is: ");
        System.out.println(myShape.getPerimeter());
        System.out.print("The area of the Rectangle shape is: ");
        System.out.println(myShape.getArea());

        // Print new line for spacing
        System.out.println();

        // New shape object Square
        myShape = new Square(4);
        // Print out perimeter and area of myShape
        System.out.print("The perimeter of the Square shape is: ");
        System.out.println(myShape.getPerimeter());
        System.out.print("The area of the Square shape is: ");
        System.out.println(myShape.getArea());

    }
}
