package movies;

// TODO: change this to wherever your Input class is located
import util.Input;

public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;
    private static Movie [] movies;

    public static void main(String[] args) {
        // Grab all the movies from array
        movies = MoviesArray.findAll();

        Input input = new Input();

        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt(0, 5);
            System.out.println();
            System.out.println("Here are some movies:");
            doChoice(choice);
            System.out.println();

        }
    }

    private static void printMenu() {
        System.out.print("""
            Need a movie to watch?
            Choose a category:
            
            0 - Exit
            1 - View all movies
            2 - View movies in the Musical category
            3 - View movies in the Drama category
            4 - View movies in the Horror category
            5 - View movies in the Scifi category
                        
            """);
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch (choice) {
            case 1 ->
                // TODO: View all movies
                    printCategory("all");
            case 2 ->
                // TODO: View movies in the Musical category
                    printCategory("musical");
            case 3 ->
                // TODO: View movies in the Drama category
                    printCategory("drama");
            case 4 ->
                // TODO: View movies in the Horror category
                    printCategory("horror");
            case 5 ->
                // TODO: View movies in the Scifi category
                    printCategory("scifi");
        }
    }

    private static void printCategory(String category) {
        // Loop through movies and print based on categories
        for(Movie movie: movies) {
            if(movie.getCategory().equals(category)|| category.equals("All")) {
                System.out.println(movie);
            }
        }
    }


}