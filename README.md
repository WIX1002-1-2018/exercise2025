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
- [`W05E07.java`](Exercise2025/src/W05/W05E07.java) — Expenses tracker: repeatedly reads amounts, validates and sums them until the user types "done". Demonstrates input parsing with `Double.parseDouble()` and exception handling. (Original author: [@Safazalfa](https://github.com/Safazalfa))
- [`W05E08.java`](Exercise2025/src/W05/W05E08.java) — Finding maximum and minimum values: uses `Integer.MAX_VALUE` and `Integer.MIN_VALUE` for initialization, validates input range, and tracks highest/lowest scores.
- [`W05E09.java`](Exercise2025/src/W05/W05E09.java) — Password strength checker: analyzes password characters using `Character` class methods (isUpperCase, isLowerCase, isDigit), classifies strength as Strong/Medium/Weak based on character type diversity. (Original author: [@dejettss](https://github.com/dejettss))
- [`W05E10.java`](Exercise2025/src/W05/W05E10.java) — Number triangle pattern generator: uses nested loops to create incrementing number patterns, outer loop controls rows, inner loop prints sequential numbers for each row. (Original author: [@shaoern0606](https://github.com/shaoern0606))
 - [`W05E11.java`](Exercise2025/src/W05/W05E11.java) — Prime key validator: repeatedly prompts for an integer > 50, checks if it is prime, and only accepts valid prime keys. Demonstrates input validation, prime checking, and user feedback. (Original author: [@Ying038](https://github.com/Ying038))
 - [`W05E12.java`](Exercise2025/src/W05/W05E12.java) — Fibonacci rabbit population simulation: prints the number of rabbit pairs for each month using the Fibonacci sequence, stops if the population exceeds 1000. (Original author: [@muhdnuqman](https://github.com/muhdnuqman))
- [`W05E13.java`](Exercise2025/src/W05/W05E13.java) — Christmas tree pattern generator: advanced nested loops creating a pyramid tree with trunk, uses arithmetic series for dimension calculations and space positioning for symmetrical output. (Original author: [@muhdnuqman](https://github.com/muhdnuqman))

Summary of Week 06 (W06)
-------------------------
The `src/W06` folder contains Java examples demonstrating arrays and array operations:

- [`W06E01.java`](Exercise2025/src/W06/W06E01.java) — Basic array declaration and initialization: creating arrays with `new`, initializing with values, accessing and modifying elements. Shows both int and String arrays.
- [`W06E02.java`](Exercise2025/src/W06/W06E02.java) — Array traversal: demonstrates accessing array elements individually vs. using a for loop and enhanced for-each loop. Introduces `array.length` property and shows efficient iteration methods.
- [`W06E03.java`](Exercise2025/src/W06/W06E03.java) — Large arrays: creating an array with 100 elements, accessing first and last elements (index 0 and 99).
- [`W06E04.java`](Exercise2025/src/W06/W06E04.java) — Character arrays: declaring, initializing, modifying, and displaying char arrays using loops.
- [`W06E05.java`](Exercise2025/src/W06/W06E05.java) — Random array generation and counting: fills array with random 'M' or 'F' values, counts occurrences of a specific character. (Original author: [@hafidzmrizky](https://github.com/hafidzmrizky))
- [`W06E05a.java`](Exercise2025/src/W06/W06E05a.java) — Alternative gender counting: compact version using ternary operator and inline counting during array generation. (Original author: [@muhdnuqman](https://github.com/muhdnuqman))
- [`W06E06.java`](Exercise2025/src/W06/W06E06.java) — String splitting: uses `String.split()` method to convert comma-separated string into array, demonstrates enhanced for-each loop. (Original author: Tey Yong Zhun)
- [`W06E07.java`](Exercise2025/src/W06/W06E07.java) — Bubble sort algorithm: generates 20 random numbers, implements bubble sort to arrange in ascending order, displays both ascending and descending sorted arrays. (Original author: Yaseen Ayatullah Khan)
- [`W06E08.java`](Exercise2025/src/W06/W06E08.java) — Array statistics with sorting: generates 20 random numbers, uses bubble sort, and calculates minimum (first element), maximum (last element), and sum of all elements. (Original author: Tey Yong Zhun)
- [`W06E09.java`](Exercise2025/src/W06/W06E09.java) — Linear search algorithm: demonstrates sequential search on unsorted array with O(n) time complexity, counts comparisons to show efficiency, searches element by element from start to end. (Original author: [@muhdnuqman](https://github.com/muhdnuqman))
- [`W06E10.java`](Exercise2025/src/W06/W06E10.java) — Binary search algorithm: demonstrates efficient divide-and-conquer search on sorted array with O(log n) time complexity, shows step-by-step search process, compares efficiency with linear search.

**Tutorial Exercises (W06T):**
- [`W06T04.java`](Exercise2025/src/W06/W06T04.java) — Counting word occurrences: searches string array for specific word ("the"), counts how many times it appears using `equals()` method.
- [`W06T05.java`](Exercise2025/src/W06/W06T05.java) — Reversing array elements: iterates through string array in reverse order, reverses each word using `StringBuilder.reverse()`.
- [`W06T05_1.java`](Exercise2025/src/W06/W06T05_1.java) — Alternative string reversal: demonstrates two methods - manual character iteration using `charAt()` and using `StringBuilder` for comparison.
- [`W06T06.java`](Exercise2025/src/W06/W06T06.java) — Decimal to binary conversion: generates random number (0-255), converts to 8-bit binary representation using array, stores bits through modulo and division operations.

Summary of Week 07 (W07)
-------------------------
The `src/W07` folder focuses on advancing method usage, 2D arrays, method overloading, array mutability, returning grouped results, shape printing, and utility algorithms:

- [`W07E01.java`](Exercise2025/src/W07/W07E01.java) — 2D inventory table: rows hold shoe size & random stock; classifies status (Out / Low / Available).
- [`W07E02.java`](Exercise2025/src/W07/W07E02.java) — Weekly sales matrix (sizes × days) with single-pass highest sale tracking.
- [`W07E03.java`](Exercise2025/src/W07/W07E03.java) — Menu-driven launcher choosing inventory vs sales demo; highlights user input routing and helper methods.
- [`W07E04.java`](Exercise2025/src/W07/W07E04.java) — Parameterized greeting methods showing argument passing and reuse.
- [`W07E05.java`](Exercise2025/src/W07/W07E05.java) — Void vs return methods; sum printing vs returning and simple age validation.
- [`W07E06.java`](Exercise2025/src/W07/W07E06.java) — Method overloading showcase (`computeArea`, `sum`, `describe`) illustrating arity, type selection, flags, and varargs precedence.
- [`W07E07.java`](Exercise2025/src/W07/W07E07.java) — Array mutation vs pure operations; in-place transforms plus grouped statistics (min/max/sum, average/std dev) and cloning contrast.
- [`W07L01.java`](Exercise2025/src/W07/W07L01.java) — Shape printing (triangle & diamond) via reusable `multiPrint` helper to eliminate repetition.
- [`W07T01.java`](Exercise2025/src/W07/W07T01.java) — Assorted utilities: max-of-three, perfect square test, combinations, pentagonal detection, first duplicate random, circle metrics, letter/digit counting, random array fill.
- [`W07T02.java`](Exercise2025/src/W07/W07T02.java) — Manual descending ordering of three ints using pairwise swaps (no arrays needed).

All Week 07 examples authored by pensyarah and enriched with structured educational headers.

Summary of Week 09 (W09)
-------------------------
The `src/W09` folder demonstrates file I/O in text and binary form, resource management styles, and utility wrappers:

- [`W09E01.java`](Exercise2025/src/W09/W09E01.java) — Write 10 random integers (0–1000) to `integer.txt` using text output.
- [`W09E02.java`](Exercise2025/src/W09/W09E02.java) — Read integers from `integer.txt`, echo the list, and report the maximum value.
- [`W09E03.java`](Exercise2025/src/W09/W09E03.java) — Write 10 random integers (0–1000) to `integer.dat` in binary using `ObjectOutputStream`.
- [`W09E04.java`](Exercise2025/src/W09/W09E04.java) — Read integers from `integer.dat`, display them, and compute the average with EOF handling.
- [`W09E05.java`](Exercise2025/src/W09/W09E05.java) — Encode a string to binary bits in `dataBinary.txt`, then decode back to text (original author: Badrul).
- [`W09E06.java`](Exercise2025/src/W09/W09E06.java) — `java.io.File` usage demo: path metadata, create/check/delete files and directories, and list contents.
- [`W09E07.java`](Exercise2025/src/W09/W09E07.java) — Contrast traditional try/finally resource handling with try-with-resources while reading a sample file.
- [`W09E08.java`](Exercise2025/src/W09/W09E08.java) — Combined text-file workflow: static methods to write random ints to a file and read them back to find the max (E01+E02 in one class).
- [`W09E09.java`](Exercise2025/src/W09/W09E09.java) — Combined binary-file workflow: static methods to write random ints to a binary file and read/average them (E03+E04 in one class).

Summary of Week 10 (W10)
-------------------------
The `src/W10` folder provides a progressive introduction to object-oriented programming in Java, covering classes, encapsulation, and polymorphism concepts:

- [`W10E01.java`](Exercise2025/src/W10/W10E01.java) — Introduction to classes: understanding what a class is, basic structure with instance variables, creating objects, and accessing attributes. Demonstrates the blueprint-object relationship.
- [`W10E02.java`](Exercise2025/src/W10/W10E02.java) — Instance variables and methods: adding behavior to classes through methods, distinguishing instance vs local variables, methods that use and modify object state.
- [`W10E03.java`](Exercise2025/src/W10/W10E03.java) — Constructors: special methods for object initialization, constructor syntax (same name as class, no return type), automatic invocation with `new`, and cleaner object creation.
- [`W10E04.java`](Exercise2025/src/W10/W10E04.java) — Accessor methods (getters): introduction to encapsulation with `private` variables, creating getter methods for controlled read access, naming conventions (`getVariableName()`, `isVariableName()` for booleans).
- [`W10E05.java`](Exercise2025/src/W10/W10E05.java) — Mutator methods (setters): creating setter methods for controlled write access, data validation in setters, maintaining data integrity, complete encapsulation pattern with getters and setters.
- [`W10E06.java`](Exercise2025/src/W10/W10E06.java) — Complete class design: bringing together private variables, constructors, getters, setters, and behavior methods in a well-designed Product class following OOP principles.
- [`W10E07.java`](Exercise2025/src/W10/W10E07.java) — Constructor overloading: multiple constructors with different parameter lists, providing flexibility in object creation, default values, and convenience constructors (e.g., square from one parameter).
- [`W10E08.java`](Exercise2025/src/W10/W10E08.java) — Method overloading: multiple methods with same name but different parameters (number, type, or order), demonstrates type selection and practical Calculator class examples.
- [`W10E09.java`](Exercise2025/src/W10/W10E09.java) — Combining constructor and method overloading: practical BankAccount class using both techniques together for maximum flexibility (deposit, withdraw, transfer with optional descriptions).
- [`W10E10.java`](Exercise2025/src/W10/W10E10.java) — Comprehensive library system: complete application bringing all Week 10 concepts together with Book and Library classes, demonstrating object interactions, encapsulation, overloading, and real-world OOP design.

Summary of Week 11 (W11)
-------------------------
The `src/W11` folder focuses on inheritance, overriding, constructors with `super`, access modifiers, and polymorphism:

- [`W11E01.java`](Exercise2025/src/W11/W11E01.java) — Introduction to classes: simple fields, constructor, and instance method for self-introduction.
- [`W11E02.java`](Exercise2025/src/W11/W11E02.java) — First inheritance example: child `StudentE02` extends parent `PersonE02`, reusing a greeting method.
- [`W11E03.java`](Exercise2025/src/W11/W11E03.java) — Constructor chaining with `super`: parent runs first, child adds its own setup.
- [`W11E04.java`](Exercise2025/src/W11/W11E04.java) — Overriding methods: child replaces parent description; dynamic dispatch chooses the child version.
- [`W11E05.java`](Exercise2025/src/W11/W11E05.java) — Using `super.method()`: extend parent behavior while keeping its output.
- [`W11E06.java`](Exercise2025/src/W11/W11E06.java) — Protected vs private members: subclasses can call protected methods; private stays inside the class.
- [`W11E07.java`](Exercise2025/src/W11/W11E07.java) — Comparing access modifiers: public vs protected vs private visibility in practice.
- [`W11E08.java`](Exercise2025/src/W11/W11E08.java) — Final methods: inherited behaviors that cannot be overridden.
- [`W11E09.java`](Exercise2025/src/W11/W11E09.java) — Object class methods: overriding `toString()`, `equals()`, and `hashCode()` for readable and comparable objects.
- [`W11E10.java`](Exercise2025/src/W11/W11E10.java) — Polymorphism with an abstract base: array of shapes calling each specific `area()` implementation.

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


