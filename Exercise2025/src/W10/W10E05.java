package W10;

/**
 * W10E05 - Mutator Methods (Setters)
 * 
 * LEARNING OBJECTIVES:
 * - Create and use setter methods (mutators)
 * - Understand how to validate data in setters
 * - Learn the complete encapsulation pattern
 * 
 * JOURNAL:
 * Mutator methods (setters) are used to:
 * - Modify the value of private instance variables
 * - Provide controlled write access to data
 * - Validate data before setting it
 * 
 * Naming convention: setVariableName(type parameter)
 * 
 * Benefits of setters:
 * - Can validate input before setting
 * - Can perform additional actions when data changes
 * - Maintains data integrity
 */

class Student {
    // Private instance variables
    private String studentId;
    private String name;
    private int age;
    private double gpa;
    
    // Constructor
    Student(String id, String n, int a, double g) {
        studentId = id;
        name = n;
        setAge(a);      // Use setter for validation
        setGpa(g);      // Use setter for validation
    }
    
    // Accessor methods (Getters)
    public String getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Mutator methods (Setters) with validation
    
    public void setName(String n) {
        if (n != null && !n.trim().isEmpty()) {
            name = n;
            System.out.println("Name updated successfully.");
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }
    
    public void setAge(int a) {
        if (a >= 5 && a <= 100) {
            age = a;
            System.out.println("Age updated successfully.");
        } else {
            System.out.println("Error: Age must be between 5 and 100!");
            age = 18; // Default value
        }
    }
    
    public void setGpa(double g) {
        if (g >= 0.0 && g <= 4.0) {
            gpa = g;
            System.out.println("GPA updated successfully.");
        } else {
            System.out.println("Error: GPA must be between 0.0 and 4.0!");
            gpa = 0.0; // Default value
        }
    }
    
    // Display method
    public void displayInfo() {
        System.out.println("\n=== Student Information ===");
        System.out.println("ID: " + getStudentId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("GPA: " + getGpa());
    }
}

public class W10E05 {
    public static void main(String[] args) {
        System.out.println("=== Creating Student ===");
        Student student = new Student("S001", "Alice Johnson", 20, 3.5);
        
        student.displayInfo();
        
        System.out.println("\n=== Testing Valid Updates ===");
        student.setAge(21);
        student.setGpa(3.8);
        student.setName("Alice Jane Johnson");
        
        student.displayInfo();
        
        System.out.println("\n=== Testing Invalid Updates ===");
        student.setAge(150);      // Invalid - too old
        student.setGpa(5.0);      // Invalid - too high
        student.setName("");      // Invalid - empty name
        
        student.displayInfo();
        
        // KEY TAKEAWAY:
        // - Setters provide controlled write access to private variables
        // - Setters can validate data before setting it
        // - Format: public void setVariableName(type parameter) { ... }
        // - Setters protect data integrity
        // - Always use setters to modify private variables
        // - Getters + Setters = Complete encapsulation
    }
}
