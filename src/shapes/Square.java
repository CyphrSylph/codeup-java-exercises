package shapes;

public class Square extends Rectangle{

    // Constructor
    public Square (int side) {
        super(side,side);
    }

    // Override getArea method from Rectangle Class
    @Override
    public int getArea() {
        return length * length;
    }

    // Override getPerimeter method from Rectangle Class
    @Override
    public int getPerimeter() {
        return 4 * length;
    }
}
