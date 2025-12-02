package W07;

/**
 * W07E04 - Basic Method Parameters & Reuse
 * Demonstrates: Defining methods that accept parameters and producing
 * different outputs based on arguments.
 *
 * Methods:
 * - mynewMethod(String country): Prints a simple greeting.
 * - mynewMethod2(String day, String country): Prints a time-of-day greeting.
 *
 * Key Concepts:
 * - Method overloading vs distinct method names (here: distinct names).
 * - Passing multiple parameters.
 * - Reuse by calling methods with varied arguments.
 *
 * @author pensyarah
 */
public class W07E04 {
    public static void mynewMethod(String country) {
        System.out.println("Hello world " + country);
    }

    public static void mynewMethod2(String day, String country) {
        System.out.println("Good " + day + " " + country);
    }

    public static void main(String[] args) {
        mynewMethod("Malaysia");
        mynewMethod("India");
        mynewMethod("China");
        mynewMethod2("Morning", "Malaysia");
        mynewMethod2("Evening", "Malaysia");
    }
}
