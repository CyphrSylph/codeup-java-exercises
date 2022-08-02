
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Use float to format the value of the variable pi
        double pi = 3.14159;
        System.out.format("The value of pi is approximately " + "%.2f%n", pi);

        // Use the nextInt method to store the value of an int variable
        // Declare variable for integer
        Scanner in = new Scanner(System.in);
        int integer;
        // Prompt for integer value
        System.out.println("Enter an integer...");
        // Read out of input value
        integer = in.nextInt();
        System.out.println("You entered: " + integer);

        // Use the nextLine method to store the value of a string variable
        // Declare variables for string
        Scanner in2 = new Scanner(System.in);
        String string1;
        String string2;
        String string3;
        // Prompt for string inputs
        System.out.println("Enter three words and separate each with a return...");
        // Read out of string inputs
        string1 = in2.nextLine();
        string2 = in2.nextLine();
        string3 = in2.nextLine();
        System.out.print("You entered: " + string1);
        System.out.print(" " + string2);
        System.out.println(" " + string3);

        // Use the nextLine method to store the value of a string variable
        // Declare variable for string
        Scanner in3 = new Scanner(System.in);
        String string4;
        // Prompt for string input
        System.out.println("Enter a sentence...");
        // Read out of string input
        string4 = in3.nextLine();
        System.out.println("You entered: " + string4);

        // Use the nextLine method to store the value of string variable
        // Parse the resulting string to a numeric type
        Scanner in4 = new Scanner(System.in);
        String strLength;
        String strWidth;
        // Prompt for string input with value
        System.out.println("Enter the length and width of the room separated by a return...");
        // Read out of string input with value
        strLength = in4.nextLine();
        strWidth = in4.nextLine();
        int intLength = parseInt(strLength);
        int intWidth = parseInt(strWidth);
        int area = intLength * intWidth;
        System.out.print("You entered: " + area);
    }
}
