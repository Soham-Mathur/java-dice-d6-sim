# 🎲 Dice Roller
A fun command-line dice roller built in Java that simulates rolling multiple six-sided dice with ASCII art output, input validation, and replay functionality.

## Features

* Roll any number of six-sided dice at once
* Display ASCII art for each die face (1–6)
* Calculate and display the total roll value
* Replay without restarting the program
* Input validation with user-friendly error messages

## Concepts Demonstrated

* Command-line input handling
* Input validation and exception handling
* ASCII art rendering using Java text blocks
* Random number generation
* `do-while` loop control flow
* `switch` expressions

## Project Structure

```text
└── Main.java    # Main program file containing game logic and ASCII rendering
```

## Requirements

* Java 8 or higher

## How to Run

Compile:

```bash
javac Main.java
```

Run:

```bash
java Main
```

## Usage

Enter the number of dice you would like to roll. Each die is displayed individually using ASCII art, followed by the total value of all rolls. You can then choose to roll again or exit the program.

> [!CAUTION]
> This program accepts values up to 2.1 billion dice. No cap has been intentionally set to give users full control over the program. However, entering extremely large numbers will cause your terminal or IDE to freeze. Use reasonable values to avoid performance issues.

### Example

```
**==============*WELCOME*==============**

Enter the number of dice you want to roll: 2

You rolled: 3
 ---------
| ●       |
|    ●    |
|       ● |
 ---------

You rolled: 5
 ---------
| ●     ● |
|    ●    |
| ●     ● |
 ---------

******************
Your total was: 8
******************

Roll Again (y/n)?
```

## Error Handling

The program includes validation for common user input errors:

* Non-integer input prompts the user to enter a valid whole number
* Zero or negative dice counts are rejected
* Invalid replay responses repeat until `y` or `n` is entered

## Design Overview

All six die faces are stored as Java text block strings and rendered through a dedicated `printDie(int roll)` method using a `switch` expression.

```java
static void printDie(int roll) {
    switch (roll) {
        case 1 -> System.out.println(dice1);
        // ...
    }
}
```

This design keeps the rendering logic clean, organized, and easy to extend for additional die types in the future.

## Future Improvements

* Support for additional dice types (`d4`, `d8`, `d10`, `d12`, `d20`)
* Roll history and statistics tracking
* Enhanced input validation
* Unit testing with JUnit
* GUI implementation using Java Swing or JavaFX

## License

This project is open-source and intended for educational purposes.