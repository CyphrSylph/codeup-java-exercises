public class ControlFlowExercises {
    // The keyboard shortcut for main method is psvm + tab
    public static void main(String[] args) {
        // Set an int variable with a value of 5
        int a = 5;
        // Set a while loop that runs as long as the variable is <= 15
        while (a <= 15) {
            // Print each loop iteration into one line separated by spaces
            // Increment the output by one each loop iteration
            System.out.print((a++) +" ");
        }
        // Return a new line
        System.out.println();
        System.out.println();

        // Set a do-while loop that counts by 2's from 0 to 100
        int b = 0;
        do {
            // Print each loop iteration into a new line
            System.out.println(b+=2);
        } while (b < 100);
        // Return a new line
        System.out.println();

        // Set a do-while loop that counts backwards by 5's from 100 to -10
        int c = 100;
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
    }
}
