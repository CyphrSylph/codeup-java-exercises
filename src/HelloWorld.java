// HelloWorld Program:
// Define the class and ensure the name of the class matches the name of the src file
public class HelloWorld {
    // Define the main method and entry point to the application
    public static void main(String[] args) {
        // Use System.out.print to output info without a new line
        System.out.print("Hello, ");
        System.out.println("World!");
        // Use System.out.println to outout info followed by a new line
        System.out.println("Hello, World!");
        // Use int to assign a value to a variable
        int myFavoriteNumber = 3;
        System.out.println("The Power of " + myFavoriteNumber + " is the collective power of the...");
        // Use String to assign a string value to a variable
        String myString = "Charmed Ones";
        System.out.println(myString);
        // Assign a character value to the variable using char
        myString = myString.valueOf('P');
        System.out.println(myString);
        // Assign a value to the variable using double
        myString = myString.valueOf(3.14159);
        System.out.println(myString);
        // Use long to assign a value to a variable
        long myNumber = 123;
        System.out.println(myNumber);
        // Use float to assign a value to a variable
        float myOtherNumber = (float)3.14;
        System.out.println(myOtherNumber);
        // Use int to assign a value to a varible and postincrement it
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        // Use int to assign a value to a varible and preincrement it
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        // Write expressions using shorthand assignment operators
        int a = 4;
        a += 5;
        System.out.println(a);
        int b = 3;
        int c = 4;
        c = (c*b);
        System.out.println(c);
        int d = 10;
        int e = 2;
        d = (d/e);
        e = (e-d);
        System.out.println(d);
        System.out.println(e);
    }
}
