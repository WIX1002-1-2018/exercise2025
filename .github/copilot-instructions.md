# AI Coding Agent Instructions for exercise2025

## Project Overview

This is a **Java course exercise repository** (WIX1002-2025) containing progressively complex programming exercises organized by week. Each week covers specific Java concepts, building toward advanced OOP topics like inheritance, polymorphism, and interfaces.

## Repository Structure

- **`Exercise2025/src/`** - Main source code organized by week
  - `W01/` - Basic output and escape sequences (`W01E01.java` - `W01E08.java`)
  - `W02/` - Variables, constants, I/O basics
  - `W03/` - Conditionals (`if`, `switch`, ternary)
  - `W04/` - Loops (`for`, `while`, `do-while`, labeled loops)
  - `W05/` - Input validation, nested loops, string analysis
  - `W06/` - Arrays and 2D arrays
  - `W07/` - Collections (ArrayList, HashMap), methods, 2D arrays
  - `W08/` - **Capstone procedural**: Scenario-based combining W01-W07 (no OOP)
  - `W09/` onwards - Classes, inheritance, polymorphism, interfaces
  - `W12/` - Capstone exercises combining OOP concepts

- **Build System**: NetBeans Ant-based (`build.xml`, `nbproject/`)
- **Output Files**: Generated `.txt` files saved to `Exercise2025/` root

## Critical Code Patterns

### 1. File I/O with Try-With-Resources
**File**: [W12E13.java](Exercise2025/src/W12/W12E13.java), [W12E05.java](Exercise2025/src/W12/W12E05.java)

```java
try (Scanner scanner = new Scanner(inputData);
     PrintWriter writer = new PrintWriter("output.txt")) {
    // Resource management: automatically closes on exit
    scanner.useLocale(Locale.US);  // Consistent parsing
    while (scanner.hasNext()) { /* process */ }
}
```

**Key conventions**:
- Use `try-with-resources` for Scanner/PrintWriter (not manual `.close()`)
- Always set `Locale.US` when parsing numbers to avoid regional variations
- Check `hasNext()` / `hasNextDouble()` before consuming tokens
- Output files use pattern `W##E##_filename.txt`

### 2. OOP Progression (W10/W11/W12)

**Inheritance Pattern** - [W12E02.java](Exercise2025/src/W12/W12E02.java):
- Base class with `protected` fields accessible to subclasses
- Subclasses call `super(name, maxSpeed)` in constructors
- Method overriding + overloading demonstrated together

**Interfaces & Abstract Classes** - [W12E13.java](Exercise2025/src/W12/W12E13.java):
- Multiple interface implementation: `abstract class Vehicle implements TransportableE13, EnvironmentallyResponsibleE13`
- Abstract methods force subclasses to implement (e.g., `abstract double getFuelEfficiency()`)
- Polymorphic processing: store objects as interface type, resolved at runtime
- Non-abstract methods in abstract classes provide shared implementation

### 3. Naming Conventions

**Strict Naming Pattern**:
- **Classes**: `W##E##ExerciseName` (e.g., `W05E11.java`, `W12E13.java`)
  - W = Week, E = Exercise, T = Tutorial, L = Lab
- **Interfaces**: Suffix with exercise number (e.g., `TransportableE13`, `EnvironmentallyResponsibleE13`)
- **Package**: `package W##;` corresponds to folder name

### 4. Input/String Parsing Patterns

**Sentinel Values** - [W04E04.java](Exercise2025/src/W04/W04E04.java):
- Use sentinel value (-1) or specific strings ("done", "exit") to terminate input loops
- Validate input type with `hasNextDouble()` before consuming

**String Validation** - [W05E03.java](Exercise2025/src/W05/W05E03.java):
- `equals()` for case-sensitive comparison
- `equalsIgnoreCase()` for flexible user input (common in loops)
- `compareTo()` for lexicographic ordering

### 5. Loop Patterns

**Loop Types by Use Case**:
- `for` loops: Known iteration count or arrays (see [W04E11.java](Exercise2025/src/W04/W04E11.java) for for-each)
- `while` loops: Sentinel-based input
- `do-while` loops: Input validation (guarantees ≥1 execution)
- Labeled `break`/`continue`: Exiting nested loops (see [W04E10.java](Exercise2025/src/W04/W04E10.java))

### 6. Formatting Output

**Locale-Aware Formatting**:
```java
String.format(Locale.US, "%.2f", value)  // Always specify Locale.US
System.out.println("Result: " + formatted);
```

**Character Analysis** (see [W05E09.java](Exercise2025/src/W05/W05E09.java)):
- `Character.isUpperCase()`, `Character.isLowerCase()`, `Character.isDigit()`

## Development Workflow

### Compiling & Running
- **Build**: `ant clean build` (NetBeans Ant)
- **Run Single Class**: Java expects class to be in `package W##;`
- **Output**: Check generated `.txt` files in `Exercise2025/` root, not in source directories

### Testing Patterns
- No formal test framework; exercises are self-contained
- Output to files for verification (PrintWriter pattern)
- Inline validation in constructors/methods

## W08: Procedural Programming Capstone

W08 combines W01-W07 concepts through realistic scenario-based exercises **without introducing OOP**:

- **W08E01**: Student grade management (arrays, input validation, conditionals)
- **W08E02**: Inventory menu system (switch, loops, parallel arrays, methods)
- **W08E03**: Sales dashboard (2D arrays, nested loops, statistics)
- **W08E04**: Text analysis tool (character analysis, string loops, counters)
- **W08E05**: Number guessing game (Random, conditionals, game loops, statistics)
- **W08E06**: Restaurant bill calculator (arithmetic, methods, formatting)
- **W08E07**: Theater seating (2D arrays, display formatting, validation)

**Pattern**: Each exercise uses helper methods but keeps all logic in `main()` or static methods (no custom classes).

## When Adding New Exercises

1. **Create class**: `W##E##.java` in `Exercise2025/src/W##/` folder
2. **Package declaration**: `package W##;`
3. **Main method**: Always include `public static void main(String[] args)`
4. **File I/O**: Use try-with-resources with Locale.US
5. **Comments**: Include LEARNING OBJECTIVES block (see W12E13 header style)
6. **Polymorphic patterns**: When building on W09+ exercises, use interface types in arrays/collections

## Anti-Patterns to Avoid

- ❌ Manual resource management: Don't use `sc.close()` outside try-with-resources
- ❌ Regional locale dependencies: Always set `Locale.US` for number parsing
- ❌ Mixed Scanner usage: Don't mix `next()` and `nextLine()` without `.skip("\n")`
- ❌ Case-sensitive string comparisons: Use `equalsIgnoreCase()` for user input
- ❌ Hardcoding paths: Use relative file names (e.g., `"W12E13_fleet.txt"` not `/path/...`)

## Key Files to Reference

- **Procedural Capstone**: [W08E01.java](Exercise2025/src/W08/W08E01.java), [W08E02.java](Exercise2025/src/W08/W08E02.java), [W08E03.java](Exercise2025/src/W08/W08E03.java)
- **I/O Patterns**: [W12E13.java](Exercise2025/src/W12/W12E13.java), [W12E05.java](Exercise2025/src/W12/W12E05.java)
- **Inheritance**: [W12E02.java](Exercise2025/src/W12/W12E02.java)
- **Input Validation**: [W05E03B.java](Exercise2025/src/W05/W05E03B.java), [W05E04C.java](Exercise2025/src/W05/W05E04C.java)
- **Loop Patterns**: [W04E08.java](Exercise2025/src/W04/W04E08.java), [W04E10.java](Exercise2025/src/W04/W04E10.java)
- **Access Modifiers**: [W11E07.java](Exercise2025/src/W11/W11E07.java)
