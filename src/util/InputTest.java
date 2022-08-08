package util;

public class InputTest {
    // Test all the methods from the Input class
    public static void main(String[] arg) {
        Input newInput = new Input();
        newInput.getString();
        newInput.getInt();
        newInput.getDouble();
        newInput.getInt(1,10);
        newInput.getDouble(1,10);
        newInput.yesNo();
    }
}
