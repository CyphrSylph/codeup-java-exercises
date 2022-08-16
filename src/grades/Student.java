package grades;

import java.util.ArrayList;

public class Student {

    // Private properties [fields]
    private String name;

    // ArrayLists specify Integer instead of int
    private static ArrayList<Integer> grades;

    // Constructor to set name property and initialize grade property
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // Returns the student's name
    public String getName() {
        return this.name;
    }

    // Adds the given grade to the grades property [ArrayList]
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Returns the average of the students grades
    public double getGradeAverage() {
        // Set variable for grade average
        double average = 0;
        // Calculate grade average with for loop
        for (double grade:grades) {
            average += grade;
        }
        // Return average from grades [Arraylist]
        return average / grades.size();
    }

}
