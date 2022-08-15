package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        // Create a new Student objects
        Student Ickis = new Student("Ickis");
        Student Krumm = new Student("Krumm");
        Student Oblina = new Student("Oblina");
        Student Horrifica = new Student("Slickis");

        // Create a HashMap for Students
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

        //Print out Student and grade average *TESTER*
        System.out.println(Oblina.getGradeAverage());
    }
}
