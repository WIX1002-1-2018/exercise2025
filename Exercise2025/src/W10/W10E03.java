package W10;

/**
 * W10E03 - Constructors
 * 
 * LEARNING OBJECTIVES:
 * - Understand what a constructor is
 * - Learn how to create a constructor
 * - Initialize objects properly using constructors
 * 
 * JOURNAL:
 * A constructor is a special method that:
 * - Has the same name as the class
 * - Has no return type (not even void)
 * - Is automatically called when an object is created
 * - Is used to initialize instance variables
 * 
 * If you don't create a constructor, Java provides a default constructor automatically.
 * Once you create your own constructor, the default one is no longer available.
 */

class Car {
    // Instance variables
    String brand;
    String model;
    int year;
    String color;
    
    // Constructor - initializes the object when it's created
    Car(String b, String m, int y, String c) {
        brand = b;
        model = m;
        year = y;
        color = c;
        System.out.println("A new car has been created!");
    }
    
    // Method to display car information
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
    
    // Method to start the car
    void start() {
        System.out.println("The " + year + " " + brand + " " + model + " is starting... Vroom!");
    }
}

public class W10E03 {
    public static void main(String[] args) {
        System.out.println("=== Creating Car Objects ===\n");
        
        // Creating objects using the constructor
        // Note: We initialize all values in one line!
        Car car1 = new Car("Toyota", "Camry", 2020, "Blue");
        
        System.out.println("\n=== Car 1 Details ===");
        car1.displayInfo();
        car1.start();
        
        System.out.println("\n=== Creating Another Car ===\n");
        Car car2 = new Car("Honda", "Civic", 2022, "Red");
        
        System.out.println("\n=== Car 2 Details ===");
        car2.displayInfo();
        car2.start();
        
        // KEY TAKEAWAY:
        // - Constructor has the same name as the class
        // - Constructor has no return type
        // - Constructor is called automatically when we use 'new'
        // - Constructors make object initialization cleaner and easier
        // - We can initialize all values at once when creating an object
    }
}
