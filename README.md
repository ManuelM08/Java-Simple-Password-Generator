---

```markdown
# Simple Password Generator

A lightweight Java console application that generates secure, random passwords based on user-defined length.

## Features
- **Validation**: Ensures the password length is between 4 and 40 characters.
- **Randomization**: Uses `java.util.Random` to ensure unpredictability.
- **Broad Character Set**: Includes uppercase letters, lowercase letters, numbers, and special symbols.
- **OOP Principles**: Built with a clear separation between logic (`Password.java`) and user interface (`Main.java`).

## How it Works
The application uses an `ArrayList` to store all allowed characters. When a password is requested, it iterates through a loop, picking a random character from the list in each step and building the final string.

## Requirements
- Java Development Kit (JDK) 8 or higher.
```
