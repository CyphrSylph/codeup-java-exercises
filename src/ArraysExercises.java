// ARRAY BASICS
// Import array utility to use Array.toString
import java.util.Arrays;

public class ArraysExercises {
    // Static method to add a person[object/element] to the array
    public static Person[] addPerson(Person[] arr, Person newPerson) {

        // Create new array with an additional element and store in new variable
        Person[] newPersonArr = Arrays.copyOf(arr, arr.length +1);

        // Store new person in last element of array
        newPersonArr[arr.length] = newPerson;

        // Return new array of people
        return newPersonArr;
    }


    public static void main(String[] args) {

        // Array of numbers
        int[] numbers = {3, 6, 9, 12, 15};
        // Arrays.toString prints the array in string form
        System.out.println("Numbers Array: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        // Create an array that holds 3 new objects using the Person class
        System.out.println("Boogie's Boys Array: ");
        Person[] people = new Person[3];
        people[0] = new Person("Lock");
        people[1] = new Person("Shock");
        people[2] = new Person("Barrel");

        // ForOf Loop to iterate over and print elements in array
        for(Person person : people){
            System.out.println(person);
        }
        System.out.println();

        // ForOf Loop to iterate over and print elements in new array
        System.out.println("Boogie's Array: ");
        people = addPerson(people, new Person("Boogie"));
        for(Person person : people){
            System.out.println(person);
        }
        System.out.println();
    }


}
