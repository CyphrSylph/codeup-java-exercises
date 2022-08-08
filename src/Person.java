// OBJECT BASICS
// CCreate a class named Person
public class Person {

    // Create a private field with a string
    private String name;


    // Set a constructor that accepts a string value
    public Person(String name) {
        this.name = name;
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
    }
}
