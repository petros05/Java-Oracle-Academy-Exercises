# 3.5 Exercises

## File Locations
- `Input01.java` is located at `src/Input01.java`
- `Input03.java` is located at `src/Input03.java`

## What This Lesson Taught
Learned how Java handles user input, data types, imports, and type conversion.

## Concepts 3.5 Exercises

### Imports
- `import javax.swing.JOptionPane;` in `src/Input01.java`
- `import java.util.Scanner;` in `src/Input03.java`

Imports built-in Java classes for two different kinds of input:
- dialog box input (`JOptionPane`)
- console input (`Scanner`)

### Data Types
- `String` for raw text input from dialog boxes
- `int` for whole-number math

Examples:
- In `src/Input01.java`, the variable `input` is a `String`.
- In `src/Input01.java` and `src/Input03.java`, numeric values are stored as `int`.

### Type Conversion
I used explicit conversion from `String` to `int` with:
- `Integer.parseInt(input)`

This was used in `src/Input01.java` to:
- convert user text input into a number
- perform arithmetic (`num + 1`)

### Input and Output
- In `src/Input01.java`, input is collected with popup dialogs and output is printed with `System.out.println`.
- In `src/Input03.java`, input is collected from the keyboard using `Scanner`, then the program adds three integers and prints the sum.

### Resource Handling
- In `src/Input03.java`, `scan.close()` is used to close the `Scanner` after input is complete.

## Summary
This lesson reinforced how to:
- import and use Java utility classes
- choose correct data types (`String` vs `int`)
- convert data types for calculations
- collect input and produce output in different ways
