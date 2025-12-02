package W07;

/**
 * W07E05 - Methods Returning / Printing Values & Simple Validation
 * Demonstrates: Void vs return methods and a basic conditional check.
 *
 * Methods:
 * - countthis(int, int): void method printing sum.
 * - countThisinMain(int, int): returns sum for caller usage.
 * - checkAge(int): prints access message based on age threshold (>=18).
 *
 * Key Concepts:
 * - Choosing between printing inside a method vs returning values.
 * - Basic conditional branching.
 * - Method reusability with different parameters.
 *
 * @author pensyarah
 */
public class W07E05 {
    static void countthis(int a, int b) { // prints sum directly
        int sum = a + b;
        System.out.println("Total is " + sum);
    }

    static int countThisinMain(int a, int b) { // returns sum for caller to format
        return a + b;
    }

    static void checkAge(int age) { // simple validation output
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        countthis(21, 4);
        System.out.println("Total is :" + countThisinMain(2, 6));
        checkAge(20);
    }
}
