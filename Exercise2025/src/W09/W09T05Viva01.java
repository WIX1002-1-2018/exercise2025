package W09;

import java.text.DecimalFormat; // For formatting output

public class W09T05Viva01 {

    // Helper function to generate sliding windows using arrays
    private static double[][] getWindows(double[] arr, int k) {
        // Validations in arrayChaosSolver ensure arr.length >= k and k > 0
        // So, numWindows will be >= 1.
        int numWindows = arr.length - k + 1;
        double[][] windowsArray = new double[numWindows][k];

        for (int i = 0; i < numWindows; i++) {
            for (int j = 0; j < k; j++) {
                windowsArray[i][j] = arr[i + j];
            }
        }
        return windowsArray;
    }

    // Method 1: Calculate the Sum of Absolute Differences within Sliding Windows
    public static double calculateSumAbsDiff(double[] arr, int k) {
        double[][] windows = getWindows(arr, k);
        double totalSumOfAbsDiffs = 0;

        for (double[] window : windows) { // Iterate over array of windows
            double sumAbsDiffInWindow = 0;
            if (window.length > 1) { // Ensure there are adjacent elements
                for (int j = 0; j < window.length - 1; j++) {
                    sumAbsDiffInWindow += Math.abs(window[j] - window[j + 1]);
                }
            }
            totalSumOfAbsDiffs += sumAbsDiffInWindow;
        }
        return totalSumOfAbsDiffs;
    }

    // Method 2: Calculate the Nested Subtraction of Window Sums
    public static double calculateNestedSubtractionWindowSums(double[] arr, int k) {
        double[][] windows = getWindows(arr, k);
        // Given validations in arrayChaosSolver, windows.length will be >= 1

        double[] windowSums = new double[windows.length];
        for (int i = 0; i < windows.length; i++) {
            double currentWindowSum = 0;
            for (double val : windows[i]) {
                currentWindowSum += val;
            }
            windowSums[i] = currentWindowSum;
        }

        double result = windowSums[0];
        for (int i = 1; i < windowSums.length; i++) {
            result -= windowSums[i];
        }
        return result;
    }

    // Method 3: Calculate the Nested Product of Division within a Sliding Window
    public static double calculateNestedProductOfDivision(double[] arr, int k) {
        double[][] windows = getWindows(arr, k);

        double[] windowDivisionValues = new double[windows.length];
        for (int i = 0; i < windows.length; i++) {
            double[] window = windows[i];
            double currentValue = window[0]; 
            if (window.length > 1) {
                for (int j = 1; j < window.length; j++) {
                    if (window[j] == 0) {
                         System.err.println("Error: Division by zero attempted in calculateNestedProductOfDivision.");
                         return Double.NaN; 
                    }
                    currentValue /= window[j];
                }
            }
            windowDivisionValues[i] = currentValue;
        }

        double finalProduct = 1.0;
        for (double val : windowDivisionValues) {
            finalProduct *= val;
        }
        return finalProduct;
    }

    // Method 4: Calculate the Nested Division of Multiplication within a Sliding Window
    public static double calculateNestedDivisionOfMultiplication(double[] arr, int k) {
        double[][] windows = getWindows(arr, k);

        double[] windowProducts = new double[windows.length];
        for (int i = 0; i < windows.length; i++) {
            double productInWindow = 1.0;
            for (double val : windows[i]) {
                productInWindow *= val;
            }
            windowProducts[i] = productInWindow;
        }
        
        double result = windowProducts[0];
        if (windowProducts.length > 1) {
            for (int i = 1; i < windowProducts.length; i++) {
                if (windowProducts[i] == 0) {
                    System.err.println("Error: Division by zero attempted in calculateNestedDivisionOfMultiplication.");
                    return Double.NaN; 
                }
                result /= windowProducts[i];
            }
        }
        return result;
    }

    // Helper method to copy a double array (replaces Arrays.copyOf)
    private static double[] copyDoubleArray(double[] source) {
        if (source == null) {
            return null;
        }
        double[] destination = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        return destination;
    }

    // Method 5: Sort the Results (using Bubble Sort)
    public static double[] bubbleSort(double[] dataList) {
        // Use custom copy method instead of Arrays.copyOf
        double[] arrToSort = copyDoubleArray(dataList); 
        if (arrToSort == null) { // Should not happen if dataList is valid
            return null;
        }
        int n = arrToSort.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arrToSort[j] > arrToSort[j + 1]) {
                    double temp = arrToSort[j];
                    arrToSort[j] = arrToSort[j + 1];
                    arrToSort[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arrToSort;
    }

    // Primary method that orchestrates the calculations and sorting
    public static double[] arrayChaosSolver(double[] arr, int k) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array 'arr' cannot be null.");
        }
        if (k <= 0) {
            throw new IllegalArgumentException("Window size 'k' must be a positive integer.");
        }
        if (arr.length < k) {
            throw new IllegalArgumentException("The input array 'arr' must contain at least 'k' elements.");
        }

        double result1 = calculateSumAbsDiff(arr, k);
        double result2 = calculateNestedSubtractionWindowSums(arr, k);
        double result3 = calculateNestedProductOfDivision(arr, k);
        double result4 = calculateNestedDivisionOfMultiplication(arr, k);

        double[] results = {result1, result2, result3, result4};
        return bubbleSort(results);
    }

    // Helper method to convert double array to String (replaces Arrays.toString)
    private static String doubleArrayToString(double[] arr) {
        if (arr == null) {
            return "null";
        }
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    // Helper method to convert double array to String with formatting
    private static String formattedDoubleArrayToString(double[] arr, DecimalFormat df) {
        if (arr == null) {
            return "null";
        }
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            sb.append(df.format(arr[i]));
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }


    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        System.out.println("--- Array Chaos Solver (Java - No Arrays Utility) ---");
        DecimalFormat df = new DecimalFormat("#.########"); // To format double output

        // Example 1 Data (for steps 1 & 2 in PDF)
        double[] arr1Pdf = {3, 7, 1, 5, 9, 2};
        int k1Pdf = 3;
        // Use custom array to string method
        System.out.println("\nProcessing arr = " + doubleArrayToString(arr1Pdf) + ", k = " + k1Pdf);
        try {
            System.out.println("  Result 1 (Sum Abs Diff): " + df.format(calculateSumAbsDiff(arr1Pdf, k1Pdf)));
            System.out.println("  Result 2 (Nested Sub Window Sums): " + df.format(calculateNestedSubtractionWindowSums(arr1Pdf, k1Pdf)));
            System.out.println("  Result 3 (Nested Prod of Div): " + df.format(calculateNestedProductOfDivision(arr1Pdf, k1Pdf)));
            System.out.println("  Result 4 (Nested Div of Mult): " + df.format(calculateNestedDivisionOfMultiplication(arr1Pdf, k1Pdf)));
            double[] sortedResultsArr1 = arrayChaosSolver(arr1Pdf, k1Pdf);
            // Use custom formatted array to string method
            System.out.println("  Sorted Results: " + formattedDoubleArrayToString(sortedResultsArr1, df));
        } catch (IllegalArgumentException e) {
            System.err.println("  Error: " + e.getMessage());
        }

        // Example 2 Data (for steps 3 & 4 in PDF)
        double[] arr2Pdf = {10, 2, 5, 1, 4, 2};
        int k2Pdf = 3;
        System.out.println("\nProcessing arr = " + doubleArrayToString(arr2Pdf) + ", k = " + k2Pdf);
        try {
            System.out.println("  Result 1 (Sum Abs Diff): " + df.format(calculateSumAbsDiff(arr2Pdf, k2Pdf)));
            System.out.println("  Result 2 (Nested Sub Window Sums): " + df.format(calculateNestedSubtractionWindowSums(arr2Pdf, k2Pdf)));
            System.out.println("  Result 3 (Nested Prod of Div): " + df.format(calculateNestedProductOfDivision(arr2Pdf, k2Pdf)));
            System.out.println("  Result 4 (Nested Div of Mult): " + df.format(calculateNestedDivisionOfMultiplication(arr2Pdf, k2Pdf)));
            double[] sortedResultsArr2 = arrayChaosSolver(arr2Pdf, k2Pdf);
            System.out.println("  Sorted Results: " + formattedDoubleArrayToString(sortedResultsArr2, df));
        } catch (IllegalArgumentException e) {
            System.err.println("  Error: " + e.getMessage());
        }

        System.out.println("\nPDF's example for final sorting (using mixed results for illustration):");
        double[] exampleMixedResults = {39, -33, 0.0625, 0.0625};
        System.out.println("  Input values: " + doubleArrayToString(exampleMixedResults));
        double[] sortedMixedResults = bubbleSort(exampleMixedResults); 
        System.out.println("  Sorted Output: " + formattedDoubleArrayToString(sortedMixedResults, df));

        // Test with an empty array (should throw exception)
        System.out.println("\nProcessing arr = [], k = 3");
        double[] emptyArr = {};
        try {
            // Note: The custom doubleArrayToString will print "[]" for emptyArr
            System.out.println("  Attempting to process: " + doubleArrayToString(emptyArr));
            arrayChaosSolver(emptyArr, 3);
        } catch (IllegalArgumentException e) {
            System.err.println("  Error: " + e.getMessage());
        }

        // Test with k > arr.length (should throw exception)
        System.out.println("\nProcessing arr = [1, 2], k = 3");
        double[] shortArr = {1, 2};
        try {
            System.out.println("  Attempting to process: " + doubleArrayToString(shortArr));
            arrayChaosSolver(shortArr, 3);
        } catch (IllegalArgumentException e) {
            System.err.println("  Error: " + e.getMessage());
        }
         // Test with k = 0 (should throw exception)
        System.out.println("\nProcessing arr = [1, 2, 3], k = 0");
        double[] testArrKZero = {1, 2, 3};
        try {
            System.out.println("  Attempting to process: " + doubleArrayToString(testArrKZero));
            arrayChaosSolver(testArrKZero, 0);
        } catch (IllegalArgumentException e) {
            System.err.println("  Error: " + e.getMessage());
        }
    }
}
