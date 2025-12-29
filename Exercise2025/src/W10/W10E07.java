package W10;

/**
 * W10E07 - Constructor Overloading
 * 
 * LEARNING OBJECTIVES:
 * - Understand constructor overloading
 * - Create multiple constructors with different parameters
 * - Learn when and why to use constructor overloading
 * 
 * JOURNAL:
 * Constructor overloading means having multiple constructors with:
 * - Same name (the class name)
 * - Different parameter lists (different number or types of parameters)
 * 
 * Benefits:
 * - Flexibility in object creation
 * - Can create objects with different initial states
 * - Default values for some parameters
 * - Convenience for users of the class
 * 
 * Java determines which constructor to call based on the arguments provided.
 */

class Rectangle {
    // Private instance variables
    private double length;
    private double width;
    private String color;
    
    // Constructor 1: No parameters (default constructor)
    // Creates a unit square with default color
    public Rectangle() {
        length = 1.0;
        width = 1.0;
        color = "White";
        System.out.println("Default constructor called - Unit square created");
    }
    
    // Constructor 2: Two parameters (length and width)
    // Creates a rectangle with default color
    public Rectangle(double l, double w) {
        length = l;
        width = w;
        color = "White";
        System.out.println("Two-parameter constructor called");
    }
    
    // Constructor 3: Three parameters (length, width, and color)
    // Creates a rectangle with all properties specified
    public Rectangle(double l, double w, String c) {
        length = l;
        width = w;
        color = c;
        System.out.println("Three-parameter constructor called");
    }
    
    // Constructor 4: One parameter (creates a square)
    // Convenience constructor for squares
    public Rectangle(double side) {
        length = side;
        width = side;
        color = "White";
        System.out.println("One-parameter constructor called - Square created");
    }
    
    // Getters
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public String getColor() {
        return color;
    }
    
    // Methods
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public void displayInfo() {
        System.out.println("Rectangle Details:");
        System.out.println("  Length: " + length);
        System.out.println("  Width: " + width);
        System.out.println("  Color: " + color);
        System.out.println("  Area: " + getArea());
        System.out.println("  Perimeter: " + getPerimeter());
    }
}

public class W10E07 {
    public static void main(String[] args) {
        System.out.println("=== Creating Rectangles with Different Constructors ===\n");
        
        // Using default constructor
        System.out.println("1. Default Constructor:");
        Rectangle rect1 = new Rectangle();
        rect1.displayInfo();
        
        // Using two-parameter constructor
        System.out.println("\n2. Two-Parameter Constructor:");
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        rect2.displayInfo();
        
        // Using three-parameter constructor
        System.out.println("\n3. Three-Parameter Constructor:");
        Rectangle rect3 = new Rectangle(7.0, 4.0, "Blue");
        rect3.displayInfo();
        
        // Using one-parameter constructor (square)
        System.out.println("\n4. One-Parameter Constructor (Square):");
        Rectangle square = new Rectangle(6.0);
        square.displayInfo();
        
        // KEY TAKEAWAY:
        // - Constructor overloading provides multiple ways to create objects
        // - Each constructor has a different parameter list
        // - Java chooses the right constructor based on arguments
        // - More constructors = more flexibility for object creation
        // - Common pattern: simpler constructors set default values
    }
}
