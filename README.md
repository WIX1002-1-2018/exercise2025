# WIX1002 Sample code for 2025

This repository contains solutions and example exercises for WIX1002 (2025).

Contents
--------
- Exercise2025/: main project folder with Java exercises organized by week (W01..W10).

Summary of Week 01 (W01)
-------------------------
The `src/W01` folder contains introductory Java examples covering basic output and escape sequences:

- [`W01E01.java`](Exercise2025/src/W01/W01E01.java) — Basic `println()` - Printing simple text messages.
- [`W01E02.java`](Exercise2025/src/W01/W01E02.java) — Printing numbers and performing basic arithmetic operations.
- [`W01E03.java`](Exercise2025/src/W01/W01E03.java) — Combining text and numbers using string concatenation.
- [`W01E04.java`](Exercise2025/src/W01/W01E04.java) — Using `\n` (newline) escape sequence for multi-line output.
- [`W01E05.java`](Exercise2025/src/W01/W01E05.java) — Using `\t` (tab) escape sequence for formatted columns.
- [`W01E06.java`](Exercise2025/src/W01/W01E06.java) — Combining `\n` and `\t` escape sequences for structured output.
- [`W01E07.java`](Exercise2025/src/W01/W01E07.java) — Other escape sequences: `\"` (quotes), `\\` (backslash), and `\'` (single quote).
- [`W01E08.java`](Exercise2025/src/W01/W01E08.java) — Creating formatted output with escape sequences (student information report).
- [`W01T01.java`](Exercise2025/src/W01/W01T01.java) — A minimal "Hello World" program (prints "Hello World").

Summary of Week 02 (W02)
-------------------------
The `src/W02` folder contains simple Java examples demonstrating basic language features:

- [`W02E01.java`](Exercise2025/src/W02/W02E01.java) — Shows primitive variable declarations (int, double, char, boolean) and prints them.
- [`W02E02.java`](Exercise2025/src/W02/W02E02.java) — Demonstrates use of constants with `final` and a small calculation (days in a semester).
- [`W02E03.java`](Exercise2025/src/W02/W02E03.java) — Demonstrates arithmetic operators, modulo, and prefix vs postfix increment behavior.
- [`W02E04.java`](Exercise2025/src/W02/W02E04.java) — Shows integer division vs. floating-point division and how casting fixes averages.
- [`W02E05.java`](Exercise2025/src/W02/W02E05.java) — String concatenation and basic console I/O using `Scanner` (reads name and age from the user).
- [`W02E06.java`](Exercise2025/src/W02/W02E06.java) — Random number generation using `Random` class (0-99) and simulating a 6-sided die roll.
- [`W02E07.java`](Exercise2025/src/W02/W02E07.java) — Modern random number generation using `RandomGenerator` interface (Java 17+) with various data types.

**Lab Exercises (W02L):**
- [`W02L01.java`](Exercise2025/src/W02/W02L01.java) — Temperature conversion from Fahrenheit to Celsius using the formula: Celsius = (Fahrenheit - 32) / 1.8. Displays result in 2 decimal places with multiple examples.
- [`W02L03.java`](Exercise2025/src/W02/W02L03.java) — Generates three random numbers (range 10-50), displays the numbers, their sum, and average in 2 decimal places.
- [`W02L05.java`](Exercise2025/src/W02/W02L05.java) — Generates one random number (range 0-10000), displays the number and the sum of all its digits. Demonstrates two methods: string conversion and mathematical approach.

**Tutorial Exercises (W02T):**
- [`W02T06.java`](Exercise2025/src/W02/W02T06.java) — Calculates the circumference of a circle given the diameter. Uses `Math.PI` constant and displays result in 3 decimal places. Includes input validation using `Scanner.hasNextDouble()`.
- [`W02T07.java`](Exercise2025/src/W02/W02T07.java) — Converts inches to meters using the conversion factor (1 inch = 2.54 cm). Displays result in 2 decimal places. Includes input validation for user input.

Summary of Week 03 (W03)
-------------------------
The `src/W03` folder contains Java examples demonstrating conditional statements and string comparisons:

- [`W03E01.java`](Exercise2025/src/W03/W03E01.java) — Basic `if` statements with comparison operators (>=, <).
- [`W03E02.java`](Exercise2025/src/W03/W03E02.java) — Using `if-else if-else` statements with logical operators (&&, ||) for range checking.
- [`W03E03.java`](Exercise2025/src/W03/W03E03.java) — Compound statements within `if` blocks (multiple statements in one condition).
- [`W03E04.java`](Exercise2025/src/W03/W03E04.java) — Multiple conditions with `if-else if-else` and compound statements.
- [`W03E05.java`](Exercise2025/src/W03/W03E05.java) — String comparison using `equals()` and `equalsIgnoreCase()` methods.
- [`W03E06.java`](Exercise2025/src/W03/W03E06.java) — String comparison using `compareTo()` method for lexicographic ordering.
- [`W03E07.java`](Exercise2025/src/W03/W03E07.java) — Modern `switch` expression (arrow syntax) vs. traditional `switch` statement with `break`.
- [`W03E08.java`](Exercise2025/src/W03/W03E08.java) — `switch` expressions as assignments and multiple case labels (e.g., `case 1, 3, 5`).
- [`W03E09.java`](Exercise2025/src/W03/W03E09.java) — Ternary operator (`? :`) for conditional expressions and assignments.
- [`W03E10.java`](Exercise2025/src/W03/W03E10.java) — Nested ternary operators for grade assignment and readable if-else alternatives; demonstrates when to use ternary vs. if-else.

**Tutorial Exercises (W03T):**
- [`W03T04.java`](Exercise2025/src/W03/W03T04.java) — Find the largest of three numbers using `if-else if` statements with comparison operators.
- [`W03T04a.java`](Exercise2025/src/W03/W03T04a.java) — Find the largest of five numbers using sequential `if` statements to track the maximum value.
- [`W03T05.java`](Exercise2025/src/W03/W03T05.java) — Determine if a year is a leap year using logical operators (divisible by 4 and not by 100, or divisible by 400).

Summary of Week 04 (W04)
-------------------------
The `src/W04` folder contains Java examples demonstrating loop structures and control flow:

- [`W04E01.java`](Exercise2025/src/W04/W04E01.java) — Comparing three types of loops: `while`, `do-while`, and `for` loops with the same output.
- [`W04E02.java`](Exercise2025/src/W04/W04E02.java) — Different approaches to print even numbers: using `if` with modulo, post-increment, and loop increment by 2.
- [`W04E03.java`](Exercise2025/src/W04/W04E03.java) — Sum numbers using `do-while` loop while the number is EVEN (stops on odd number).
- [`W04E04.java`](Exercise2025/src/W04/W04E04.java) — Sum numbers using `do-while` loop until user enters -1 (sentinel value).
- [`W04E05.java`](Exercise2025/src/W04/W04E05.java) — Sum numbers using `do-while` loop while number is in range [50, 70] with AND operator.
- [`W04E06.java`](Exercise2025/src/W04/W04E06.java) — Sum numbers using `do-while` loop while number is OUTSIDE range [50, 70] with OR operator.
- [`W04E07.java`](Exercise2025/src/W04/W04E07.java) — Sum numbers using `do-while` loop while number is in ranges [0, 10] OR [20, 30] (complex conditions).
- [`W04E08.java`](Exercise2025/src/W04/W04E08.java) — Using `break` statement to exit loops: examples in for, while, nested loops, and with conditions.
- [`W04E09.java`](Exercise2025/src/W04/W04E09.java) — Using `continue` statement to skip iterations: examples in for, while, nested loops, and filtering.
- [`W04E10.java`](Exercise2025/src/W04/W04E10.java) — Using labeled loops with `break` and `continue`: breaking/continuing from nested loops and practical 2D array search.
- [`W04E11.java`](Exercise2025/src/W04/W04E11.java) — Enhanced for loop (for-each loop): iterating through arrays and collections; comparison with traditional for loop; when to use each.

Summary of Week 05 (W05)
-------------------------
The `src/W05` folder contains Java examples demonstrating different loop types, input validation, and control structures:

- [`W05E01.java`](Exercise2025/src/W05/W05E01.java) — Comparing three loop types: `for`, `while`, and `do-while` loops printing even numbers 2-20. Shows how all three loops can produce identical output. (Original author: [@jitesh1059](https://github.com/jitesh1059), modified by [@hafidzmrizky](https://github.com/hafidzmrizky))
- [`W05E02.java`](Exercise2025/src/W05/W05E02.java) — While loop with `break` statement: infinite loop `while(true)` with sentinel value (0) to exit and sum numbers. (Original author: [@ChoiJS](https://github.com/flyingshuriken))
- [`W05E02A.java`](Exercise2025/src/W05/W05E02A.java) — Do-while loop alternative to W05E02: achieves same result using do-while structure with condition at end. (Original author: [@jitesh1059](https://github.com/jitesh1059))
- [`W05E03.java`](Exercise2025/src/W05/W05E03.java) — String input validation with `equals()`: while loop with break, validates "yes" or "no" input with error messages.
- [`W05E03A.java`](Exercise2025/src/W05/W05E03A.java) — Compact do-while loop: inline assignment in condition with `equalsIgnoreCase()` for case-insensitive comparison. (Original author: [@LuoYanHao-2025](https://github.com/LuoYanHao-2025))
- [`W05E03B.java`](Exercise2025/src/W05/W05E03B.java) — Input validation with boolean flag: uses flag variable to track validity and provide dynamic prompts. (Original author: [@LuoYanHao-2025](https://github.com/LuoYanHao-2025))
- [`W05E04.java`](Exercise2025/src/W05/W05E04.java) — Positive number validation: do-while loop ensures user enters positive number, counts retry attempts. (Original author: TEH JIA JIE)
- [`W05E04C.java`](Exercise2025/src/W05/W05E04C.java) — Alternative validation approach: cleaner do-while loop with conditional prompting inside loop, uses `printf()` for formatted output.
- [`W05E05.java`](Exercise2025/src/W05/W05E05.java) — Counting and summing even/odd numbers: for loop with modulo operator, multiple counters and accumulators. (Original author: [@IvanFong](https://github.com/IvanFong))
- [`W05E05A.java`](Exercise2025/src/W05/W05E05A.java) — Alternative with while loop: manual counter management, counts even/odd numbers (no sums). (Original author: [@azhrn](https://github.com/azhrn))
- [`W05E05B.java`](Exercise2025/src/W05/W05E05B.java) — Simplified version of W05E05: more compact code with combined variable declarations, counts and sums even/odd numbers with clearer output formatting.
- [`W05E06.java`](Exercise2025/src/W05/W05E06.java) — Nested loops for square pattern: uses nested for loops to create a square grid of characters. (Original author: [@Zzfathir](https://github.com/Zzfathir))
- [`W05E08.java`](Exercise2025/src/W05/W05E08.java) — Finding maximum and minimum values: uses `Integer.MAX_VALUE` and `Integer.MIN_VALUE` for initialization, validates input range, and tracks highest/lowest scores.
- [`W05E09.java`](Exercise2025/src/W05/W05E09.java) — Password strength checker: analyzes password characters using `Character` class methods (isUpperCase, isLowerCase, isDigit), classifies strength as Strong/Medium/Weak based on character type diversity. (Original author: [@dejettss](https://github.com/dejettss))
- [`W05E10.java`](Exercise2025/src/W05/W05E10.java) — Number triangle pattern generator: uses nested loops to create incrementing number patterns, outer loop controls rows, inner loop prints sequential numbers for each row. (Original author: [@shaoern0606](https://github.com/shaoern0606))
- [`W05E13.java`](Exercise2025/src/W05/W05E13.java) — Christmas tree pattern generator: advanced nested loops creating a pyramid tree with trunk, uses arithmetic series for dimension calculations and space positioning for symmetrical output. (Original author: [@muhdnuqman](https://github.com/muhdnuqman))

 - [`W05E11.java`](Exercise2025/src/W05/W05E11.java) — Prime key validator: repeatedly prompts for an integer > 50, checks if it is prime, and only accepts valid prime keys. Demonstrates input validation, prime checking, and user feedback. (Original author: [@chua1](https://github.com/chua1) / Chua Pei Ying)


How to run
----------

### Option 1: Using Dev Container in VS Code (Recommended)
This repository includes a `.devcontainer` configuration for the best development experience with VS Code:

1. **Prerequisites:**
   - Install [Visual Studio Code](https://code.visualstudio.com/)
   - Install [Docker Desktop](https://www.docker.com/products/docker-desktop/)
   - Install the [Dev Containers extension](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) for VS Code

2. **Open in Container:**
   ```bash
   git clone https://github.com/WIX1002-1-2018/exercise2025.git
   cd exercise2025
   code .
   ```
   - VS Code will detect the `.devcontainer` folder
   - Click "Reopen in Container" when prompted (or press `F1` and select "Dev Containers: Reopen in Container")
   - Wait for the container to build (first time only)

3. **Run a program:**
   - Navigate to any `.java` file in the `Exercise2025/src` folder
   - Right-click and select "Run Java" or click the "Run" button above the `main` method
   - Output will appear in the integrated terminal

**Benefits of Dev Container:**
- Pre-configured Java development environment
- Consistent setup across all machines
- No need to install Java locally
- All dependencies and tools included

### Option 2: Using Command Line
From the `Exercise2025` directory you can compile and run any example using `javac` and `java`.

Example (Unix / Linux / macOS):

```bash
cd Exercise2025
javac -d out $(find src -name "*.java")
java -cp out W02.W02E01
```

### Option 3: Using an IDE (NetBeans, IntelliJ IDEA, Eclipse, etc.)
Students are free to clone this repository to any Java IDE:

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd exercise2025
   ```

2. **Open in your IDE:**
   - **NetBeans**: File → Open Project → Select the `Exercise2025` folder
   - **IntelliJ IDEA**: File → Open → Select the `Exercise2025` folder
   - **Eclipse**: File → Import → Existing Projects into Workspace → Select the `Exercise2025` folder

3. **Run a program:**
   - Right-click on any `.java` file (e.g., `W01E01.java`) and select "Run File" or press Shift+F6 (NetBeans) / Ctrl+Shift+F10 (IntelliJ)

Notes
-----
- These examples are small, self-contained learning exercises intended for beginners.
- Learn Fork and Pull Request. Try to add a new file and submit pull request.
- If you help to contribute, your name will be listed as one of the contributor.

Version 5.1


