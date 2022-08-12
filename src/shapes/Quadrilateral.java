package shapes;

// Abstract Class with implementation
public abstract class Quadrilateral implements Measurable{

    // Protected Properties
    protected int length;
    protected int width;

    // Constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Get Methods [Getters]
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Abstract Set Methods [Setters]
    public abstract void setLength(int length);
    public abstract void setWidth(int width);

}
