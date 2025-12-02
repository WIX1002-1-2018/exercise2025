package W07;

/**
 * W07E06 - Method Overloading Demonstration
 * Purpose: Show how the Java compiler selects among multiple methods sharing
 *          the same name based on parameter lists (number, types, order, varargs).
 *
 * What is Method Overloading?
 *  - Multiple methods in the same class with the SAME name but DIFFERENT
 *    parameter list (arity and/or types and/or order).
 *  - Return type alone is NOT enough to overload.
 *  - Resolution happens at compile time (static binding) using the most specific match.
 *
 * Overloaded Methods Provided Here:
 *  computeArea(int side)                     -> Square area
 *  computeArea(int width, int height)        -> Rectangle area
 *  computeArea(double radius)                -> Circle area (PI * r^2)
 *  computeArea(double base, double height, boolean triangleFlag)
 *       If triangleFlag=true => Triangle (0.5 * base * height)
 *       Else => Parallelogram (base * height)
 *
 *  sum(int a, int b)                         -> Sum of two ints
 *  sum(double a, double b)                   -> Sum of two doubles (type difference)
 *  sum(int... numbers)                       -> Varargs: sum of any count of ints
 *
 *  describe(int value)                       -> Describe an int
 *  describe(double value)                    -> Describe a double
 *  describe(String s)                        -> Describe a String
 *
 * Key Concepts Illustrated:
 *  - Different parameter counts (arity)      => square vs rectangle vs triangle
 *  - Different parameter types               => int vs double versions
 *  - Use of a flag parameter to differentiate semantics.
 *  - Varargs (int... numbers) as an overloading form.
 *  - Overload selection preference (exact match over widening / varargs).
 *
 * Ambiguity Notes:
 *  - Calling sum(5, 6) chooses sum(int,int).
 *  - Calling sum(5.0, 6) promotes 6 to double, chooses sum(double,double).
 *  - Calling sum() uses the varargs version with an empty array.
 *  - Varargs is the LEAST specific; compiler uses it only if no better match.
 *
 * @author pensyarah
 */
public class W07E06 {
    // ===== Overloaded computeArea methods =====
    public static int computeArea(int side) { // square
        return side * side;
    }

    public static int computeArea(int width, int height) { // rectangle
        return width * height;
    }

    public static double computeArea(double radius) { // circle
        return Math.PI * radius * radius;
    }

    public static double computeArea(double base, double height, boolean triangleFlag) {
        return triangleFlag ? 0.5 * base * height : base * height;
    }

    // ===== Overloaded sum methods =====
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b; // double version
    }

    public static int sum(int... numbers) { // varargs version
        int total = 0;
        for (int n : numbers) total += n;
        return total;
    }

    // ===== Overloaded describe methods =====
    public static String describe(int value) {
        return "(int) " + value;
    }

    public static String describe(double value) {
        return String.format("(double) %.2f", value);
    }

    public static String describe(String s) {
        return "(String) \"" + s + "\"";
    }

    public static void main(String[] args) {
        System.out.println("=== computeArea overloading ===");
        System.out.println("Square 5 => " + computeArea(5));
        System.out.println("Rectangle 4x7 => " + computeArea(4, 7));
        System.out.println("Circle r=3 => " + computeArea(3.0));
        System.out.println("Triangle base=10 height=4 => " + computeArea(10.0, 4.0, true));
        System.out.println("Parallelogram base=10 height=4 => " + computeArea(10.0, 4.0, false));

        System.out.println("\n=== sum overloading ===");
        System.out.println("sum(5,6) => " + sum(5, 6));
        System.out.println("sum(5.0,6.0) => " + sum(5.0, 6.0));
        System.out.println("sum(varargs 1,2,3,4,5) => " + sum(1,2,3,4,5));
        System.out.println("sum(varargs none) => " + sum());

        // Mixed numeric literal: sum(5.0, 6) chooses double version
        System.out.println("sum(5.0, 6) => " + sum(5.0, 6));

        System.out.println("\n=== describe overloading ===");
        System.out.println(describe(42));
        System.out.println(describe(3.14159));
        System.out.println(describe("Hello"));

        // Overload resolution demonstration: numeric literal 10 is int by default
        System.out.println("describe(10) => " + describe(10));
        // Cast forces double overload
        System.out.println("describe((double)10) => " + describe((double)10));

        // Varargs edge examples
        System.out.println("sum(new int[]{9,9,9}) => " + sum(new int[]{9,9,9}));
        System.out.println("sum(100) => " + sum(100));
    }
}
