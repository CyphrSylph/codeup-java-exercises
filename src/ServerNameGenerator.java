// Import Random Util Java Class
import java.util.Random;

public class ServerNameGenerator {

    // New random object
    private static Random random = new Random();


    // Static string variables containing arrays
    public static String[] adjectives = {"Unnameable","Cyclopean","Eldritch","Accursed","Eerie","Ghastly","Daemonic","Petrifying","Insidious","Tenebrous"};
    public static String[] nouns = {"Terror","Creature","Spectre","Corpse","Orb","Wraith","Crypt","Figure","Portal","Hell"};

    // Grab random string from each array
    private static String getRandomString(String[] strings) {

        // Generate random index from 0 to last element in array
        int rando = random.nextInt(strings.length);
        // Return the element at the random index of the array
        return strings[rando];

    }

    // Main Method
    public static void main(String[] args) {

        // Store randomly selected string from array into variable
        String randomAdjective = getRandomString(adjectives);
        String randomNoun = getRandomString(nouns);

        // Print the randomized combo
        System.out.println("Your server name is: " + randomAdjective + "-" + randomNoun);
    }
 }
