import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(0, 3));
        System.out.println(subtraction(9, 3));
        System.out.println(multiplication(3, 3));
        System.out.println(division(144, 12));
        System.out.println(modulus(38, 23));
        System.out.println(getInteger(2, 4));
//        Scanner calc = new Scanner(System.in);
        long num = calc.nextInt();
        System.out.println("The factorial of " + num + "is " + factorial((int) (num - 1)));
    }

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

    public static int getInteger(int min, int max) {
        Scanner range = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = range.nextInt();
        if (userInput > min && userInput < max) {
            System.out.print("Huzzah! You've guessed the number ");
            return userInput;
        } else {
            System.out.println("Try again...");
        }
        return getInteger(min, max);
    }

//    public static long factorial(int num) {
//        Scanner calc = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 10:");
//        long num = calc.nextInt();
//        if (num <= 1)
//            return 1;
//        else
//            return num * factorial((num - 1), continueLoop());
//    }
//
//    public static String continueLoop() {
//        System.out.println("Continue?");
//        return "";
//    }

    public static int diceRoll(int x) {
        Scanner diceBag = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = diceBag.nextInt();
        System.out.println("Press R to roll");

    }
}