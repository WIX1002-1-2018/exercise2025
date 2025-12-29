package W10;

/**
 * W10E08 - Method Overloading
 * 
 * LEARNING OBJECTIVES:
 * - Understand method overloading
 * - Create multiple methods with the same name but different parameters
 * - Learn the rules and benefits of method overloading
 * 
 * JOURNAL:
 * Method overloading means having multiple methods with:
 * - Same name
 * - Different parameter lists (different number or types of parameters)
 * - Can have different return types (but parameter list must differ)
 * 
 * Benefits:
 * - Code is more readable and intuitive
 * - Same operation can work with different data types
 * - Users don't need to remember different method names
 * 
 * Java determines which method to call based on the arguments provided.
 */

class Calculator {
    // Method overloading example 1: Different number of parameters
    
    // Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    
    // Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    
    // Add four integers
    public int add(int a, int b, int c, int d) {
        System.out.println("Adding four integers");
        return a + b + c + d;
    }
    
    // Method overloading example 2: Different types of parameters
    
    // Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    
    // Add three doubles
    public double add(double a, double b, double c) {
        System.out.println("Adding three doubles");
        return a + b + c;
    }
    
    // Method overloading example 3: Mixed types and purposes
    
    // Multiply two integers
    public int multiply(int a, int b) {
        System.out.println("Multiplying two integers");
        return a * b;
    }
    
    // Multiply two doubles
    public double multiply(double a, double b) {
        System.out.println("Multiplying two doubles");
        return a * b;
    }
    
    // Multiply an integer by itself n times (power)
    public int multiply(int base, int power, boolean isPower) {
        System.out.println("Calculating power");
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
    
    // Display methods with different parameter types
    
    public void display(String message) {
        System.out.println("String: " + message);
    }
    
    public void display(int number) {
        System.out.println("Integer: " + number);
    }
    
    public void display(double number) {
        System.out.println("Double: " + number);
    }
    
    public void display(String label, int value) {
        System.out.println(label + ": " + value);
    }
}

public class W10E08 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Method Overloading: Different Number of Parameters ===\n");
        System.out.println("Result: " + calc.add(5, 10));
        System.out.println("Result: " + calc.add(5, 10, 15));
        System.out.println("Result: " + calc.add(5, 10, 15, 20));
        
        System.out.println("\n=== Method Overloading: Different Types of Parameters ===\n");
        System.out.println("Result: " + calc.add(5.5, 10.5));
        System.out.println("Result: " + calc.add(5.5, 10.5, 15.5));
        
        System.out.println("\n=== Method Overloading: Multiply Methods ===\n");
        System.out.println("Result: " + calc.multiply(5, 3));
        System.out.println("Result: " + calc.multiply(5.5, 2.0));
        System.out.println("Result: " + calc.multiply(2, 8, true));  // 2^8
        
        System.out.println("\n=== Method Overloading: Display Methods ===\n");
        calc.display("Hello, World!");
        calc.display(42);
        calc.display(3.14159);
        calc.display("Answer", 42);
        
        // KEY TAKEAWAY:
        // - Method overloading = same name, different parameters
        // - Parameters must differ in number, type, or order
        // - Java selects the correct method based on arguments
        // - Makes code more intuitive and flexible
        // - Commonly used in real-world Java programming
        // - Different from method overriding (which we'll learn later)
    }
}
