package W12;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * W12E03 - Polymorphism with Shapes and I/O
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Parse text input using Scanner to build objects
 * - Rely on overriding to call the correct area() at runtime
 * - Write results safely with PrintWriter and exception handling
 */
public class W12E03 {

    public static void main(String[] args) {
        // Input data: space-separated tokens representing different shapes
        // Format: SHAPE_TYPE parameter1 [parameter2]
        String inputData = "CIRCLE 3\nRECT 4 5\nCIRCLE 1.5";
        
        // Fixed array to store polymorphic Shape objects (max 10)
        ShapeE03[] shapes = new ShapeE03[10];
        
        // Counter tracks how many shapes have been added
        int count = 0;

        // Try-with-resources: automatically closes Scanner and PrintWriter
        try (Scanner scanner = new Scanner(inputData);
             PrintWriter writer = new PrintWriter("W12E03_output.txt")) {
            
            // Set locale for consistent number parsing (US format: 3.14 not 3,14)
            scanner.useLocale(Locale.US);

            // Parse input tokens one by one
            while (scanner.hasNext() && count < shapes.length) {
                String type = scanner.next();
                
                // Check for CIRCLE: parse type and required radius value
                if ("CIRCLE".equalsIgnoreCase(type) && scanner.hasNextDouble()) {
                    double r = scanner.nextDouble();
                    shapes[count++] = new CircleE03(r);
                } 
                // Check for RECTANGLE: parse type, width, and optional height
                else if ("RECT".equalsIgnoreCase(type) && scanner.hasNextDouble()) {
                    double w = scanner.nextDouble();
                    // If no second dimension provided, default to square (h = w)
                    double h = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                    shapes[count++] = new RectangleE03(w, h);
                }
            }

            // Write polymorphic results: each shape calculates its own area()
            writer.println("Shapes summary (polymorphic area):");
            for (int i = 0; i < count; i++) {
                // Call describe() with no args (overloaded version 1)
                writer.println(shapes[i].describe());
                // Call describe(String prefix) (overloaded version 2)
                // Demonstrates method overloading: same name, different parameters
                writer.println(shapes[i].describe("->"));
            }
            
            // Ensure all buffered output is written to file
            writer.flush();
            System.out.println("Wrote " + count + " shapes to W12E03_output.txt");
        } 
        // Catch file I/O or parsing errors
        catch (Exception e) {
            System.out.println("Problem writing shapes: " + e.getMessage());
        }
    }
}

// Abstract base class defining a common interface for all shapes
// Forces subclasses to implement area() calculation
abstract class ShapeE03 {
    // Abstract method: each subclass MUST override with its own area formula
    abstract double area();

    // Method 1: describe() with no parameters
    // Returns a description including the shape type and calculated area
    String describe() {
        return getClass().getSimpleName() + " area: " + String.format(Locale.US, "%.2f", area());
    }

    // Method 2: describe(String prefix) — OVERLOADED version
    // Accepts an optional prefix parameter
    // Demonstrates overloading: same name, different parameter list
    String describe(String prefix) {
        return prefix + " " + describe();
    }
}

// Concrete subclass 1: Circle shape
// Inherits describe() methods from ShapeE03
class CircleE03 extends ShapeE03 {
    private final double radius;

    CircleE03(double radius) {
        this.radius = radius;
    }

    // OVERRIDES the abstract area() method from ShapeE03
    // Implements circle area formula: π × r²
    // At runtime, polymorphism ensures the correct area() is called
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 2: Rectangle shape
// Inherits describe() methods from ShapeE03
class RectangleE03 extends ShapeE03 {
    private final double width;
    private final double height;

    RectangleE03(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // OVERRIDES the abstract area() method from ShapeE03
    // Implements rectangle area formula: width × height
    // At runtime, polymorphism ensures the correct area() is called
    @Override
    double area() {
        return width * height;
    }
}
