import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(0, 3));
        System.out.println(subtraction(9, 3));
        System.out.println(multiplication(3, 3));
        System.out.println(division(144, 12));
        System.out.println(modulus(38, 23));
        System.out.println(getInteger(1, 10));
        factorial(getInteger(1,10));
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
        System.out.print("Enter a number between " + min + " and " + max + ":");
        int userNum = range.nextInt();
        if (userNum > min && userNum < max) {
            System.out.print("Huzzah!");
        } else {
            userNum = getInteger(min, max);
        }
        return userNum;
    }


    public static long factorial(int newNum) {
        int sumNum = newNum;
        long fact = 1;
        for(int x = 1; x <= sumNum; x++) {
            fact = fact * x;
        }
        System.out.println("The factorial of " + sumNum + "is: " + fact);
        return fact;
    }


//    public static int diceRoll(int x) {
//        Scanner diceBag = new Scanner(System.in);
//        System.out.println("How many sides does your dice have?");
//        int sides = diceBag.nextInt();
//        System.out.println("Press R to roll");
//
//    }
}