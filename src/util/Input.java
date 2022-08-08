// CREATE AN INPUT VALIDATION CLASS
package util;
import java.util.Scanner;

public class Input {

    // Set up a new Scanner as a private field with the name scanner
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter the safe word: ");
        String safeWord = scanner.nextLine();
        return safeWord;
    }

    public boolean yesNo() {
        // Prompt user to continue
        System.out.println("Continue? [y/n]");
        // Store user input value
        String confirm = scanner.next();
        // Simplified if statement that returns boolean value
        return confirm.equalsIgnoreCase("y")
                || confirm.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        // Prompt user to enter a number between 1 and 10
        System.out.print("Enter a number between " + min + " and " + max + ":");
        // Store user input value
        int userInt = scanner.nextInt();
        // Validate user input value
        if (userInt > min && userInt < max) {
            // Prompt user with confirmation if correct
            return userInt;
        } else {
            // Prompt user to enter number again if incorrect
            userInt = getInt(min, max);
        }
        // Return the user input value
        return userInt;
    }

    public int getInt() {
        // Prompt user to enter a number
        System.out.println("Enter a number:");
        // Store user input value
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max) {
        // Prompt user to enter a number between 1 and 10
        System.out.print("Enter a number between " + min + " and " + max + ":");
        // Store user input value
        double userDouble = scanner.nextDouble();
        // Validate user input value
        if (userDouble > min && userDouble < max) {
            // Prompt user with confirmation if correct
            System.out.print("Correct!");
        } else {
            // Prompt user to enter number again if incorrect
            userDouble = getDouble(min, max);
        }
        // Return the user input value
        return userDouble;
    }

    public double getDouble() {
        // Prompt user to enter a number
        System.out.println("Enter a number:");
        // Store user input value
        double userDouble = scanner.nextDouble();
        return userDouble;
    }
}
