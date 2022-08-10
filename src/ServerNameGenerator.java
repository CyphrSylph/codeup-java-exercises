import java.util.Random;

public class ServerNameGenerator {

    private static Random random = new Random();
    public static String[] adjectives = {"Unnameable","Cyclopean","Eldritch","Accursed","Eerie","Ghastly","Daemonic","Petrifying","Insidious","Tenebrous"};
    public static String[] nouns = {"Terror","Creature","Spectre","Corpse","Orb","Wraith","Crypt","Figure","Portal","Hell"};

    public static void main(String[] args) {
        String randomAdjectives = getRandomString(adjectives);
    }

    private static String getRandomString(String[] strings) {

        // Generate random index from 0 to last element in array
        int rando = random.nextInt(strings.length);

        // Return the element at the random index of the array
        return strings[rando];

    }
 }
