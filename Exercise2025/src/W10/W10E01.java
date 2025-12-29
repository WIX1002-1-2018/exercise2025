package W10;

/**
 * W10E01 - Introduction to Classes
 * 
 * LEARNING OBJECTIVES:
 * - Understand what a class is
 * - Learn the basic structure of a class
 * - Create a simple class with attributes (instance variables)
 * 
 * JOURNAL:
 * A class is a blueprint or template for creating objects. It defines:
 * - Data (attributes/fields/instance variables)
 * - Behavior (methods)
 * 
 * Think of a class as a cookie cutter and objects as the cookies made from it.
 */

// This is a simple Person class
class Person {
    // Instance variables (attributes) - these define the data a Person has
    String name;
    int age;
    String address;
}

public class W10E01 {
    public static void main(String[] args) {
        // Creating an object (instance) of the Person class
        Person person1 = new Person();
        
        // Setting values to the instance variables
        person1.name = "Alice";
        person1.age = 25;
        person1.address = "123 Main Street";
        
        // Creating another object
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;
        person2.address = "456 Oak Avenue";
        
        // Accessing and displaying the data
        System.out.println("=== Person 1 ===");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Address: " + person1.address);
        
        System.out.println("\n=== Person 2 ===");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Address: " + person2.address);
        
        // KEY TAKEAWAY:
        // - A class is a template (Person)
        // - Objects are instances of a class (person1, person2)
        // - Each object has its own copy of instance variables
    }
}
