// import the scanner class
import java.util.Scanner;
// import parseInt
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Use float to format the value of the variable pi
        double pi = 3.14159;
        System.out.format("The value of pi is approximately " + "%.2f%n", pi);

        // Set a new scanner
        Scanner in = new Scanner(System.in);

        // Declare an int variable and store the value using the nextInt method
        int integer;
        // Prompt for integer value
        System.out.println("Enter an integer...");
        // Read out of input value
        integer = in.nextInt();
        // Reset the Scanner
        in.nextLine();
        System.out.println("You entered: " + integer);
        // Reset the scanner
        in.nextLine();

        // Declare a string variable and store the input using the nextInt method
        String string1;
        String string2;
        String string3;
        // Prompt for string inputs
        System.out.println("Enter three words and separate each with a return...");
        // Read out of string inputs
        string1 = in.nextLine();
        string2 = in.nextLine();
        string3 = in.nextLine();
        System.out.print("You entered: " + string1);
        System.out.print(" " + string2);
        System.out.println(" " + string3);
        // Reset the scanner
        in.nextLine();

        // Declare a string variable and store the input using the nextInt method
        String string4;
        // Prompt for string input
        System.out.println("Enter a sentence...");
        // Read out of string input
        string4 = in.nextLine();
        System.out.println("You entered: " + string4);
        // Reset the scanner
        in.nextLine();

        // Use the nextLine method to store the values of string variables
        String strLength;
        String strWidth;
        // Prompt for string inputs with values
        System.out.println("Enter the length and width of the room separated by a return...");
        // Read out of string inputs with value
        strLength = in.nextLine();
        strWidth = in.nextLine();
        // Parse the resulting strings to a numeric type
        int intLength = parseInt(strLength);
        int intWidth = parseInt(strWidth);
        // Calculate area based on numeric values
        int area = intLength * intWidth;
        // Read out of area based on user input
        System.out.print("The area of the space is: " + area);
        // Reset the scanner
        in.nextLine();
    }
}
