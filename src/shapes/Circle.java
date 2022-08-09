package shapes;

// Import math for PI calculation
import static java.lang.Math.PI;

// Set class to calculate circle variables
public class Circle {

    // Private field with variable for radius using double
    private double radius;

    // Constructor to initialize the value of the variable
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate the area based on user radius
    public double getArea() {
        double area = PI * Math.pow(radius,2);
        return area;
    }

    // Calculate the circumference based on user radius
    public double getCircumference() {
        double circum = 2 * PI * radius;
        return circum;
    }
}
