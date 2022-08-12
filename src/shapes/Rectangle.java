package shapes;

// INHERITANCE & POLYMORPHISM
//
//public class Rectangle {
//
//    // Protected Fields
//    protected int length;
//    protected int width;
//
//    // Constructors
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    // Accessors
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    // Methods with inline variables
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//}


// INTERFACES & ABSTRACT CLASSES

public class Rectangle extends Quadrilateral{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
