import java.util.Scanner;

public class ControlFlowExercises {
    // Main method keyboard shortcut is psvm + tab
    public static void main(String[] args) {

        // LOOP BASICS
        // Set a while loop that counts from 5 to 15
        int a = 5;
        while (a <= 15) {
            // Print each loop iteration into one line separated by spaces
            System.out.print((a++) +" ");
        }
        // Return new line keyboard shortcut is sout + tab
        System.out.println();
        System.out.println();

        // Set a do-while loop that counts by 2's from 0 to 100
        int b = 0;
        System.out.println(b);
        do {
            // Print each loop iteration into a new line
            System.out.println(b+=2);
        } while (b < 100);
        System.out.println();

        // Set a do-while loop that counts backwards by 5's from 100 to -10
        int c = 100;
        System.out.println(c);
        do {
            System.out.println(c-=5);
        } while (c > -10);
        System.out.println();

        // Set a do-while loop that squares the value from 2 to 1,000,000
        long d = 2;
        do {
            System.out.println(d);
            d*=d;
        } while (d < 1000000);
        System.out.println();

        // Refactor the previous exercises using a for loop
        for(int e = 5; e <= 15; e += 1) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println();

        for(int f = 0; f <= 100; f+=2) {
            System.out.println(f);
        }
        System.out.println();

        for(int g = 100; g >= -10; g-=5) {
            System.out.println(g);
        }
        System.out.println();

        for(long h = 2; h < 1000000; h*=h) {
            System.out.println(h);
        }
        System.out.println();


        // FIZZBUZZ
        // Write a program that prints the numbers from 1 to 100
        for(int i = 1; i <= 100; i++) {
            // For numbers which are multiples of both 3 and 5: print “FizzBuzz”.
            if (((i % 3) == 0) && ((i & 5) == 0))
                System.out.println("FizzBuzz");
            // For multiples of 3: print “Fizz” instead of the number
            else if((i % 3) == 0)
                System.out.println("Fizz");
            // For the multiples of 5: print “Buzz”
            else if((i % 5) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
        System.out.println();


        // TABLE OF POWERS
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        // Prompt the user to enter an integer
        do {
            System.out.println("Enter an integer: ");
            int integer = input.nextInt();
            System.out.println();
            // Display a table of squares and cubes from 1 based on the user input
            System.out.println("Here is your table:");
            System.out.println();
            System.out.println("number | square | cube");
            System.out.println("------ | ------ | ----");
            for (int k = 1; k <= integer; k++) {
                System.out.format("%-6d", k);
                System.out.print("|");
                System.out.print(k * k);
                System.out.print("|");
                System.out.println(k * k * k);
            }
            System.out.println(integer + " | " + "intSquared" + " | " + "intCubed");
            // Ask if the user wants to continue and only continue if they agree
            System.out.println("Would you like to continue? (y/n)");
            String userResponse = input.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                continueLoop = false;
            }
        } while (continueLoop);
    }
}
