// OBJECT BASICS
// Create a class named Person
public class Person {

    // Create a private field with a string
    private String name;


    // Set a constructor that accepts a string value
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Set accessors [getters & setters]
    public String getName(){
        //TODO: Return the person's name
        return name;
    }

    public void setName(String name){
        //TODO: Change the name field to the passed value
        this.name = name;
    }


    //TODO: Print a message to the console using the person's name
    public void sayHello(){
        System.out.println("Good day, " + this.name);
        System.out.println("...");
        System.out.println("I said good day!");
    }


    // Set a main method that creates a new object
    public static void main (String[] arg) {
        Person ambrose = new Person("Ambrose");
        ambrose.sayHello();

        // UNDERSTANDING REFERENCES
        // Examine the outcomes of the codeblocks below
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); // returns true
        System.out.println(person1 == person2); // returns false

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4); // returns true

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName()); // returns John
        System.out.println(person6.getName()); // returns John
        person6.setName("Jane");
        System.out.println(person5.getName()); // returns Jane
        System.out.println(person6.getName()); // returns Jane


    }
}
