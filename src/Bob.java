import java.util.Scanner;

// CREATE A LAZY CHAT BOT
public class Bob {
    public static void main(String[] args) {
        Scanner chat = new Scanner(System.in);
        boolean continueChat = true;
        String question = "Sure.";
        String exclaim = "Whoa, chill out!";
        String empty = "Fine. Be that way!";
        String other = "Whatever.";
        System.out.println("You are now chatting with Bob:");
        do {
            String userInput = chat.nextLine();
            System.out.println();
            if(userInput.endsWith("?"))
                System.out.println(question);
            else if(userInput.endsWith("!"))
                System.out.println(exclaim);
            else if(userInput.equals(""))
                System.out.println(empty);
            else
                System.out.println(other);
        } while (continueChat);
    }
}
