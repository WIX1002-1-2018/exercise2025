# WIX1002 Sample code for 2025

This repository contains solutions and example exercises for WIX1002 (2025).

Contents
--------
- Exercise2025/: main project folder with Java exercises organized by week (W01..W10).

Summary of Week 01 (W01)
-------------------------
- `src/W01/W01T01.java` — A minimal "Hello World" program (prints "Hello World").

Summary of Week 02 (W02)
-------------------------
The `src/W02` folder contains simple Java examples demonstrating basic language features:

- `W02E01.java` — Shows primitive variable declarations (int, double, char, boolean) and prints them.
- `W02E02.java` — Demonstrates use of constants with `final` and a small calculation (days in a semester).
- `W02E03.java` — Demonstrates arithmetic operators, modulo, and prefix vs postfix increment behavior.
- `W02E04.java` — Shows integer division vs. floating-point division and how casting fixes averages.
- `W02E05.java` — String concatenation and basic console I/O using `Scanner` (reads name and age from the user).
- `W02E06.java` — Random number generation examples (0-99) and simulating a 6-sided die roll.

How to run
----------
From the `Exercise2025` directory you can compile and run any example using `javac` and `java`.

Example (Unix / Linux / macOS):

```bash
cd Exercise2025
javac -d out $(find src -name "*.java")
java -cp out W02.W02E01
```

Notes
-----
- These examples are small, self-contained learning exercises intended for beginners.
- If you want, I can extend this README with running instructions per OS, or add a simple build script (Makefile) or Gradle/Maven configuration.

