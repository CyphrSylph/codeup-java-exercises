package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;


public class GradesApplication {
    public static void main(String[] args) {

        // Create a new Student objects
        Student Ickis = new Student("Ickis");
        Student Krumm = new Student("Krumm");
        Student Oblina = new Student("Oblina");
        Student Horrifica = new Student("Slickis");

        // HASHMAP & ARRAYLIST
        // Create a hashmap to store Students and their usernames
        HashMap<Student, String> students = new HashMap<>();

        // Add a set of grades for each student to grades ArrayList
        Ickis.addGrade(65);
        Ickis.addGrade(70);
        Ickis.addGrade(55);

        Krumm.addGrade(75);
        Krumm.addGrade(65);
        Krumm.addGrade(75);

        Oblina.addGrade(95);
        Oblina.addGrade(85);
        Oblina.addGrade(90);

        Horrifica.addGrade(80);
        Horrifica.addGrade(85);
        Horrifica.addGrade(80);

        // Set key-value pairs for Student and their username
        students.put(Ickis , "SuperRoboDDG");
        students.put(Krumm,"StinkEye");
        students.put(Oblina, "SwiftyShifter");
        students.put(Horrifica, "HeadHorror");

        // GradesApp Method
        GradesApp(students);


        // COMMAND LINE INTERFACE
        // Welcome the user
        System.out.println("Welcome to the Monster Academy!");
        System.out.println();

    }

    public static void GradesApp(HashMap<Student, String> students) {
        // Grab new user input
        Input input = new Input();

        // Set choice for continue of student selection
        boolean confirm;

        // Print new line for spacing
        System.out.println();

        // Initiate do-while loop for user prompts
        do {
            // Prompt to user to enter a username of student to view profile
            System.out.println("Select a monster to view:");

            // Print the list of student usernames
            for (Map.Entry<Student, String> entry : students.entrySet()) {
                System.out.printf("-%s %n", entry.getValue());
            }
            // Grab selected userName of student
            String userName = input.getString();

            // If the selected username of student is not in the arrayList
            if (!students.containsValue(userName)) {
                // Prompt user that it is not available
                System.out.println("Ooh! It doesn't appear we have that profile.");

            // If the selected username is available
            } else {
                // Cast selected userName of student in new variable
                Student selectedStudent = (Student) students.get(userName);
                // Print out profile of selected student
                System.out.printf("Monster Profile: %s", userName);
                System.out.printf("Monster Name: %s", selectedStudent.getName());
                System.out.printf("Grade Average: %s", selectedStudent.getGradeAverage());
            }

            // Ask the user if they want to continue the search
            System.out.println("Are you seeking another monster? [y/n]");
            String userConfirm = input.getString();
            confirm = userConfirm.equalsIgnoreCase("y");

        } while (confirm);
        System.out.println("Breaks Over! Back to Class!");
    }
}
