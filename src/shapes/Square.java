package shapes;

// INHERITANCE & POLYMORPHISM

//public class Square extends Rectangle{
//
//    //INHERITANCE & POLYMORPHISM
//
//    // Constructor
//    public Square (int side) {
//        super(side,side);
//    }
//
//    // Override getArea method from Rectangle Class
//    @Override
//    public int getArea() {
//        return length * length;
//    }
//
//    // Override getPerimeter method from Rectangle Class
//    @Override
//    public int getPerimeter() {
//        return 4 * length;
//    }
//
//}


// INTERFACES & ABSTRACT CLASSES

public class Square extends Rectangle {
    public Square(int length) {
        super(length,length);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
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
