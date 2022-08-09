import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        // Select a random number between 1 and 100 [the number to guess]
        int magicNum = (int)(1 + Math.random() * 100);

        // Prompt user to guess the number
        System.out.println("Greetings! Podling!");
        System.out.println("Do you think you can find the magic number?");
        System.out.println("It's hiding somewhere between 1 and 100...");

        // Set a scanner to store the user inputs
        Scanner magicScanner = new Scanner(System.in);

        // Set a boolean value of false until the random number is guessed
        boolean found = false;

        // Initiate a while loop for the duration of the guessing sequence
        while(!found){

            // Store the user input with the scanner
            int userNum = magicScanner.nextInt();

            // If the random number is lower than the user input prompt user to retry
            if(magicNum < userNum) {
                System.out.println("Oof! " + userNum + " is too high!");
                System.out.println("Try again!");
            }

            // If the random number is higher than the user input prompt user to retry
            else if (magicNum > userNum) {
                System.out.println("Hmm, " + userNum + " is too low.");
                System.out.println("Keep trying Podling!");
            }

            // If the random number is guessed prompt user with win and set boolean value to true
            else {
                System.out.println("Alas! You've found the magic number " + magicNum +"!");
                found = true;
            }
        }

    }
}
