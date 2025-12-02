package W07;

import java.util.Arrays;
import java.util.Random;

/**
 * W07E07 - Arrays as Mutable Data in Static Methods & Returning Multiple Values
 * Purpose: Demonstrate that Java passes object references by value; modifying
 *          an array's contents inside a static method affects the caller without
 *          needing a return. Also show how arrays can bundle multiple results.
 *
 * Concepts Demonstrated:
 *  1. In-place mutation (incrementAll, replaceNegativesWithZero) without return.
 *  2. Returning multiple values using primitive arrays (computeStats, computeMoreStats).
 *  3. Separation of concerns: one method mutates, another analyzes.
 *  4. Immutability contrast: primitives vs array elements.
 *
 * Method Summary:
 *  - incrementAll(int[] a): adds 1 to every element (in-place).
 *  - replaceNegativesWithZero(int[] a): sanitizes negative values (in-place).
 *  - computeStats(int[] a): returns {min, max, sum} as int[].
 *  - computeMoreStats(int[] a): returns {average, standardDeviation} as double[].
 *  - cloneAndDouble(int[] a): returns a NEW array (original unchanged) to contrast.
 *
 * Key Notes:
 *  - No copy made in mutator methods: caller sees changed content immediately.
 *  - Returning arrays lets us avoid designing small data classes for grouped results.
 *  - For larger systems, prefer a record/class for readability; arrays are fine for simple demos.
 *
 * @author pensyarah
 */
public class W07E07 {
    // In-place mutation: increment each element
    public static void incrementAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
    }

    // In-place mutation: turn negatives into zero
    public static void replaceNegativesWithZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) a[i] = 0;
        }
    }

    // Return multiple integer results: min, max, sum
    public static int[] computeStats(int[] a) {
        if (a.length == 0) return new int[]{0,0,0}; // simple edge case handling
        int min = a[0];
        int max = a[0];
        int sum = 0;
        for (int v : a) {
            if (v < min) min = v;
            if (v > max) max = v;
            sum += v;
        }
        return new int[]{min, max, sum};
    }

    // Return average & sample standard deviation
    public static double[] computeMoreStats(int[] a) {
        if (a.length == 0) return new double[]{0.0,0.0};
        double sum = 0;
        for (int v : a) sum += v;
        double avg = sum / a.length;
        double varianceSum = 0;
        for (int v : a) {
            double diff = v - avg;
            varianceSum += diff * diff;
        }
        // sample standard deviation (n>1) else 0
        double stdDev = (a.length > 1) ? Math.sqrt(varianceSum / (a.length - 1)) : 0.0;
        return new double[]{avg, stdDev};
    }

    // Non-mutating: returns new array with each element doubled (original unchanged)
    public static int[] cloneAndDouble(int[] a) {
        int[] copy = a.clone();
        for (int i = 0; i < copy.length; i++) copy[i] *= 2;
        return copy;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            // Include possible negatives to show sanitation
            data[i] = rand.nextInt(21) - 10; // range: -10..10
        }

        System.out.println("Original data:          " + Arrays.toString(data));

        // Mutate in-place (no return needed)
        replaceNegativesWithZero(data);
        System.out.println("After negatives->0:     " + Arrays.toString(data));

        incrementAll(data);
        System.out.println("After incrementAll:     " + Arrays.toString(data));

        // Compute grouped stats via returned arrays
        int[] stats = computeStats(data); // {min,max,sum}
        double[] more = computeMoreStats(data); // {average, stdDev}
        System.out.println("Stats {min,max,sum}:     " + Arrays.toString(stats));
        System.out.printf("More stats {avg,stdDev}: [%.2f, %.2f]%n", more[0], more[1]);

        // Show non-mutating variant
        int[] doubled = cloneAndDouble(data);
        System.out.println("Doubled copy (new arr): " + Arrays.toString(doubled));
        System.out.println("Original after copy:    " + Arrays.toString(data));

        // Emphasize that methods modified the same array instance
        System.out.println("Same reference still used (identity hash): " + System.identityHashCode(data));
    }
}
