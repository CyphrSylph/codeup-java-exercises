import java.util.Scanner;

public class MethodsExercises {
    // Test code by calling methods under the main method
    public static void main(String[] args) {
        // Basic Arithmetic Methods
        System.out.println(addition(0, 3));
        System.out.println(subtraction(9, 3));
        System.out.println(multiplication(3, 3));
        System.out.println(division(144, 12));
        System.out.println(modulus(38, 23));
        // New line for spacing
        System.out.println();
        // System dialog for numerical range validation
        System.out.println("Let's try to validate an input.");
        // Validation Method
        System.out.println("Cool! Looks like " + getInteger(1, 10) + " is in range.");
        System.out.println();
        // System dialog for factorials
        System.out.println("Now, let's count factorials! ");
        // Factorial Method calling Validation Method
        System.out.println(factorial(getInteger( 1, 10)));
        System.out.println();
        // Dice Roll Method
        diceRoll();
    }

    // BASIC ARITHMETIC
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }


    // VALIDATE USER INPUT BASED ON NUMERICAL RANGE
    public static int getInteger(int min, int max) {
        // Set new scanner for input range
        Scanner range = new Scanner(System.in);

        // Prompt user to enter a number between 1 and 10
        System.out.print("Enter a number between " + min + " and " + max + ":");

        // Store user input value using scanner
        int userNum = range.nextInt();

        // Validate user input value based on range
        if (userNum > min && userNum < max) {
            // Prompt the user if the number is within range
//            System.out.print("Cool! Look's like the number ");
            return userNum;
        } else {
            // Prompt user to try again if the number is out of range
            userNum = getInteger(min, max);
        }

        // Return the user input value
        return userNum;
    }


    // CALCULATE THE FACTORIAL OF A NUMBER
    public static long factorial(int newNum) {
        // Assign a value to a variable using int
        int sumNum = newNum;

        // Assign a value to a variable using long
        long fact = 1;

        // Set a for loop to calculate to factorial
        for(int x = 1; x <= sumNum; x++) {
            fact = fact * x;
        }

        // Read back the user input via prompt
        System.out.print("The factorial of " + sumNum + " is: ");

        // Return the factorial
        return fact;
    }


    // DICE ROLL SIMULATION
    public static void diceRoll() {
        // Variables to roll dice and continue playing
        String roll = "r";
        String confirm = "y";

        // Set while loop to house the dice roll
        while (confirm.equalsIgnoreCase("y")) {

            // Set a new scanner for the dice roll
            Scanner diceBag = new Scanner(System.in);

            // Prompt the user to enter how many sides their dice has
            System.out.print("Let's play dice! ");
            System.out.print("How many sides does your dice have?");

            // Store the number of sides entered
            int sides = diceBag.nextInt();

            // Prompt the user to roll the dice
            System.out.print("Okay, let's start! Press R to roll the dice");
            roll = diceBag.next();

            // Roll the dice using an if statement
            if(roll.equalsIgnoreCase("r")) {
                int die1 = (int)(Math.random() * sides +1);
                int die2 = (int)(Math.random() * sides +1);
                System.out.println("Your first roll is " + die1);
                System.out.println("And your second roll is " + die2);
                System.out.println();
            }
            // Prompt the user if they'd like to continue playing
            System.out.print("Want to play another round? [y/n]");
            confirm = diceBag.next();
            System.out.println();
        }
    }
}