package grades;

public class StudentTest {
    public static void main(String[] args) {
        // Create new Student object
        Student Ickis = new Student("Ickis");
        // Add grades to arraylist of new student object
        Ickis.addGrade(65);
        Ickis.addGrade(70);
        Ickis.addGrade(55);
        // Print out grade average of new student object
        System.out.println("Current GPA: ");
        System.out.println(Ickis.getGradeAverage());
    }
}
