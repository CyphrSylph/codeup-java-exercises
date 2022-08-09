package shapes;

import util.Input;

// Set class to create a circle object
public class CircleApp {

    // Set main method for testing sub methods
    public static void main(String[] args) {

        // Import input class to access methods
        Input radiusInput = new Input();

        // Prompt user for Circle App
        System.out.println("Let's make a circle!");
        System.out.println("To start we will need a radius...");

        // Import getDouble method to grab user radius
        double userRadius = radiusInput.getDouble();

        // Insert new line for spacing
        System.out.println();

        // Create new circle object
        Circle circle = new Circle(userRadius);

        // Call method to calculate area of circle and print result
        System.out.print("The area of the circle is: ");
        System.out.println(circle.getArea());

        // Call method to calculate circumference of circle and print result
        System.out.print("The circumference of the circle is: ");
        System.out.println(circle.getCircumference());

    }
}
