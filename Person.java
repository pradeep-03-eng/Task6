package task6;

public class Person {
	// Attributes
    private String name;
    private int age;

    
    // Constructor
    public Person() {
        this.name = "Pradeep";
        this.age = 32;
    }

    
    // Getter for name
    public String getName() {
        return name;
    }

   
    // Getter for age
    public int getAge() {
        return age;
    }

   
    // Main method for testing
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

