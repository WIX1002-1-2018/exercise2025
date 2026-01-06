package W12;

import java.util.Scanner;

/**
 * W12E08 - Dynamic Binding with Collections
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Build objects from tokenized input using Scanner
 * - Demonstrate runtime binding of speak() for different subclasses
 * - Overload feed() to show multiple method signatures
 */
public class W12E08 {

    public static void main(String[] args) {
        // Input data: newline-separated pet types
        String animals = "CAT\nDOG\nCAT";
        
        // Array to store polymorphic Pet objects (max 10)
        PetE08[] pets = new PetE08[10];
        int count = 0;

        // Try-with-resources: automatically closes Scanner
        try (Scanner scanner = new Scanner(animals)) {
            // Parse input tokens and create pet objects
            while (scanner.hasNext() && count < pets.length) {
                String type = scanner.next();
                // Use ternary operator to create Cat or Dog based on type
                pets[count++] = "CAT".equalsIgnoreCase(type) ? new CatE08() : new DogE08();
            }
        }

        // Iterate through pets and call methods (runtime polymorphism)
        for (int i = 0; i < count; i++) {
            // Call abstract speak() - resolved at runtime based on actual pet type
            pets[i].speak();
            // Call feed with single parameter
            pets[i].feed("kibble");
            // Call overloaded feed with two parameters
            pets[i].feed("kibble", 2);
        }
    }
}

// Abstract base class for pets
// Forces subclasses to implement speak() behavior
abstract class PetE08 {
    // Abstract method: each subclass MUST provide its own implementation
    abstract void speak();

    // Concrete method: feeds pet with specified food
    void feed(String food) {
        System.out.println(getClass().getSimpleName() + " eats " + food + ".");
    }

    // Overloaded version: includes number of scoops
    // Demonstrates method overloading: same name, different parameters
    void feed(String food, int scoops) {
        System.out.println(getClass().getSimpleName() + " eats " + scoops + " scoop(s) of " + food + ".");
    }
}

// Concrete subclass: Cat
class CatE08 extends PetE08 {
    // OVERRIDES abstract speak() method with cat-specific behavior
    @Override
    void speak() {
        System.out.println("Cat says meow.");
    }
}

// Concrete subclass: Dog
class DogE08 extends PetE08 {
    // OVERRIDES abstract speak() method with dog-specific behavior
    @Override
    void speak() {
        System.out.println("Dog says woof.");
    }
}
