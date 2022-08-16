package util;

public class TrialAndError {
    public static void main(String[] args) {
        // Create new input object
        Input input = new Input();
        // Grab user input using getInt method
        int userInt = input.getInt();
        // Print out user input
        System.out.println(userInt);

        // Create new input object
        Input input2 = new Input();
        // Grab user input using getInt method
        double userDub = input2.getDouble();
        // Print out user input
        System.out.println(userDub);


    }
}
