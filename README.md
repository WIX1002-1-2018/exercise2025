# WIX1002 Sample code for 2025

This repository contains solutions and example exercises for WIX1002 (2025).

Contents
--------
- Exercise2025/: main project folder with Java exercises organized by week (W01..W10).

Summary of Week 01 (W01)
-------------------------
The `src/W01` folder contains introductory Java examples covering basic output and escape sequences:

- `W01E01.java` — Basic `println()` - Printing simple text messages.
- `W01E02.java` — Printing numbers and performing basic arithmetic operations.
- `W01E03.java` — Combining text and numbers using string concatenation.
- `W01E04.java` — Using `\n` (newline) escape sequence for multi-line output.
- `W01E05.java` — Using `\t` (tab) escape sequence for formatted columns.
- `W01E06.java` — Combining `\n` and `\t` escape sequences for structured output.
- `W01E07.java` — Other escape sequences: `\"` (quotes), `\\` (backslash), and `\'` (single quote).
- `W01E08.java` — Creating formatted output with escape sequences (student information report).
- `W01T01.java` — A minimal "Hello World" program (prints "Hello World").

Summary of Week 02 (W02)
-------------------------
The `src/W02` folder contains simple Java examples demonstrating basic language features:

- `W02E01.java` — Shows primitive variable declarations (int, double, char, boolean) and prints them.
- `W02E02.java` — Demonstrates use of constants with `final` and a small calculation (days in a semester).
- `W02E03.java` — Demonstrates arithmetic operators, modulo, and prefix vs postfix increment behavior.
- `W02E04.java` — Shows integer division vs. floating-point division and how casting fixes averages.
- `W02E05.java` — String concatenation and basic console I/O using `Scanner` (reads name and age from the user).
- `W02E06.java` — Random number generation using `Random` class (0-99) and simulating a 6-sided die roll.
- `W02E07.java` — Modern random number generation using `RandomGenerator` interface (Java 17+) with various data types.
 - `W02T06.java` — Reads diameter input and prints the circle circumference using `C = πd` (`Math.PI`), formatted to three decimal places.
 - `W02T07.java` — Converts inches to meters (1 inch = 2.54 cm) and prints the result to two decimal places.

Summary of Week 03 (W03)
-------------------------
The `src/W03` folder contains Java examples demonstrating conditional statements and string comparisons:

- `W03E01.java` — Basic `if` statements with comparison operators (>=, <).
- `W03E02.java` — Using `if-else if-else` statements with logical operators (&&, ||) for range checking.
- `W03E03.java` — Compound statements within `if` blocks (multiple statements in one condition).
- `W03E04.java` — Multiple conditions with `if-else if-else` and compound statements.
- `W03E05.java` — String comparison using `equals()` and `equalsIgnoreCase()` methods.
- `W03E06.java` — String comparison using `compareTo()` method for lexicographic ordering.
- `W03E07.java` — Modern `switch` expression (arrow syntax) vs. traditional `switch` statement with `break`.
- `W03E08.java` — `switch` expressions as assignments and multiple case labels (e.g., `case 1, 3, 5`).
- `W03E09.java` — Ternary operator (`? :`) for conditional expressions and assignments.
- `W03E10.java` — Nested ternary example, the clearer `if-else` equivalent, a boolean ternary, and a null-check ternary (compact examples with recommendations on readability).

How to run
----------

### Option 1: Using Command Line
From the `Exercise2025` directory you can compile and run any example using `javac` and `java`.

Example (Unix / Linux / macOS):

```bash
cd Exercise2025
javac -d out $(find src -name "*.java")
java -cp out W02.W02E01
```

If you want to run the newly added `W03E10` example specifically, compile and run it (from the repository root):

```bash
cd Exercise2025
javac -d out $(find src -name "W03E10.java")
java -cp out W03.W03E10
```

Sample output from `W03E10` (demonstrates grade assignment and ternary examples):

```
Score: 85 -> Grade (nested ternary): B
Grade (if-else): B
Result: Passed
Short message: Excellent
maybeNull -> No value
```

### Option 2: Using an IDE (NetBeans, IntelliJ IDEA, Eclipse, etc.)
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
- If you want, I can extend this README with running instructions per OS, or add a simple build script (Makefile) or Gradle/Maven configuration.

