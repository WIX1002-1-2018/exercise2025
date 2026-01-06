package W08;

import java.util.Scanner;

/**
 * W08E04 - Text Analysis Tool
 *
 * SCENARIO: Analyze a text passage to count characters, words, sentences, and specific patterns.
 * COMBINES: W01 (escape sequences), W04 (loops), W05 (string analysis, Character methods),
 *           W03 (conditionals), input validation
 *
 * LEARNING OBJECTIVES:
 * - Process strings character by character using charAt() and length
 * - Use Character class methods (isUpperCase, isLowerCase, isDigit, isWhitespace)
 * - Count different categories of characters
 * - Validate and normalize user input
 * - Use flags and counters to track state across loops
 */
public class W08E04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Text Analysis Tool ===\n");
        System.out.println("Enter a text passage (press Enter twice to finish):");
        System.out.println("---");

        // Read multi-line input until empty line
        StringBuilder text = new StringBuilder();
        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            text.append(line).append("\n");
        }

        if (text.length() == 0) {
            System.out.println("No text entered.");
            sc.close();
            return;
        }

        String passage = text.toString().trim();

        // Perform analysis
        System.out.println("---\n");
        analyzeText(passage);

        sc.close();
    }

    static void analyzeText(String text) {
        int charCount = 0;
        int wordCount = 1;
        int sentenceCount = 0;
        int digitCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int spaceCount = 0;
        int vowelCount = 0;

        boolean prevWasSpace = true; // To count word boundaries

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Count total characters
            charCount++;

            // Count specific character types
            if (Character.isUpperCase(c)) upperCount++;
            if (Character.isLowerCase(c)) lowerCount++;
            if (Character.isDigit(c)) digitCount++;
            if (Character.isWhitespace(c)) spaceCount++;
            if (c == ' ' && !prevWasSpace) wordCount++;

            // Count vowels
            char lower = Character.toLowerCase(c);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowelCount++;
            }

            // Count sentences (ending with . ! ?)
            if (c == '.' || c == '!' || c == '?') {
                sentenceCount++;
            }

            prevWasSpace = Character.isWhitespace(c);
        }

        // Adjust word count if text doesn't end with space
        if (!Character.isWhitespace(text.charAt(text.length() - 1))) {
            // Already counted the first word, so don't add 1 again
        }

        // Display results
        System.out.println("=== Analysis Results ===");
        System.out.println("Total characters: " + charCount);
        System.out.println("  - Uppercase letters: " + upperCount);
        System.out.println("  - Lowercase letters: " + lowerCount);
        System.out.println("  - Digits: " + digitCount);
        System.out.println("  - Spaces: " + spaceCount);
        System.out.println("  - Vowels: " + vowelCount);

        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);

        // Calculate averages
        if (wordCount > 0) {
            double avgCharsPerWord = (double) charCount / wordCount;
            System.out.println(String.format("Average chars per word: %.2f", avgCharsPerWord));
        }

        if (sentenceCount > 0) {
            double avgWordsPerSentence = (double) wordCount / sentenceCount;
            System.out.println(String.format("Average words per sentence: %.2f", avgWordsPerSentence));
        }
    }
}
