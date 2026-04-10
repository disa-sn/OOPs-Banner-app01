/**
 * HelloApp.java - A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to "World" if no name is given.
 * * Key Concepts: Defensive Programming, Ternary Operators, and Array Handling.
 * * @author Divyansh Sanadhya
 * @version 3.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        // Using the Ternary Operator for concise default value assignment [cite: 675]
        // Syntax: condition ? valueIfTrue : valueIfFalse
        String name = (args.length > 0) ? args[0] : "World";

        // Display personalized or default greeting 
        System.out.println("Hello, " + name + "!");
    }
}