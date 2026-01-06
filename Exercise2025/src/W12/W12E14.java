package W12;

/**
 * W12E14 - Polymorphism: Early Binding vs. Late Binding
 *
 * CONTEXT: Capstone exercise demonstrating fundamental polymorphism concepts.
 * LEARNING OBJECTIVES:
 * - Understand static typing (Early Binding / Compile-time Polymorphism)
 * - Understand dynamic typing (Late Binding / Runtime Polymorphism)
 * - Compare method overloading (early binding) vs. method overriding (late binding)
 * - Demonstrate how polymorphism resolves method calls at runtime
 */
public class W12E14 {

    public static void main(String[] args) {
        System.out.println("=== EARLY BINDING (Compile-time Polymorphism) ===\n");
        
        // Method Overloading: Multiple methods with same name, different parameters
        // The compiler decides WHICH METHOD to call based on parameter types
        // This is resolved at COMPILE-TIME (early binding)
        
        Calculator calc = new Calculator();
        
        System.out.println("Overloaded add() methods (Early Binding):");
        System.out.println("  add(5, 3) = " + calc.add(5, 3));           // Calls add(int, int)
        System.out.println("  add(5.5, 3.2) = " + calc.add(5.5, 3.2));   // Calls add(double, double)
        System.out.println("  add(5, 3, 2) = " + calc.add(5, 3, 2));     // Calls add(int, int, int)
        System.out.println("  add(\"Hello\", \" World\") = " + calc.add("Hello", " World")); // Calls add(String, String)
        
        System.out.println("\n=== LATE BINDING (Runtime Polymorphism) ===\n");
        
        // Method Overriding: Different classes implement same method differently
        // The JVM decides WHICH METHOD to call based on the ACTUAL OBJECT TYPE
        // This is resolved at RUNTIME (late binding)
        
        System.out.println("Overridden describe() methods (Late Binding):");
        
        // Create objects of different types
        AnimalE14 dog = new DogE14();      // dog is-a AnimalE14
        AnimalE14 cat = new CatE14();      // cat is-a AnimalE14
        AnimalE14 parrot = new ParrotE14(); // parrot is-a AnimalE14
        
        // Store all in parent class array (polymorphic array)
        AnimalE14[] animals = { dog, cat, parrot };
        
        // Same code, but different behavior depending on actual object type
        // The JVM uses the VTABLE (virtual method table) at runtime to find the correct method
        for (AnimalE14 animal : animals) {
            // Even though we're calling through AnimalE14 reference,
            // Java uses late binding to call the ACTUAL object's describe() method
            System.out.println("  " + animal.describe());
            System.out.println("  " + animal.makeSound());
        }
        
        System.out.println("\n=== KEY DIFFERENCE ===\n");
        System.out.println("Early Binding (Overloading):");
        System.out.println("  - Resolved at COMPILE-TIME based on parameter TYPES");
        System.out.println("  - Compiler checks method signature and picks the matching one");
        System.out.println("  - Faster (no runtime overhead)");
        
        System.out.println("\nLate Binding (Overriding):");
        System.out.println("  - Resolved at RUNTIME based on actual OBJECT TYPE");
        System.out.println("  - JVM looks up which class the object actually is");
        System.out.println("  - Enables true polymorphism and flexible code design");
        System.out.println("  - Foundation of object-oriented design");
    }
}

// ============================================================================
// EARLY BINDING EXAMPLE: Method Overloading
// ============================================================================
class Calculator {
    // Overload 1: Two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overload 2: Two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Overload 3: Three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overload 4: Two strings
    public String add(String a, String b) {
        return a + b;
    }
}

// ============================================================================
// LATE BINDING EXAMPLE: Method Overriding
// ============================================================================

// Base class: Parent type
abstract class AnimalE14 {
    protected String name;
    
    public AnimalE14(String name) {
        this.name = name;
    }
    
    // Abstract method: subclasses MUST override
    public abstract String describe();
    
    // Overridable method: subclasses CAN override
    public abstract String makeSound();
}

// Subclass 1: Dog
class DogE14 extends AnimalE14 {
    public DogE14() {
        super("Dog");
    }
    
    @Override
    public String describe() {
        return name + " is a four-legged mammal that barks";
    }
    
    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
}

// Subclass 2: Cat
class CatE14 extends AnimalE14 {
    public CatE14() {
        super("Cat");
    }
    
    @Override
    public String describe() {
        return name + " is a feline that purrs";
    }
    
    @Override
    public String makeSound() {
        return "Meow! Meow!";
    }
}

// Subclass 3: Parrot
class ParrotE14 extends AnimalE14 {
    public ParrotE14() {
        super("Parrot");
    }
    
    @Override
    public String describe() {
        return name + " is a colorful bird that talks";
    }
    
    @Override
    public String makeSound() {
        return "Squawk! Squawk!";
    }
}
