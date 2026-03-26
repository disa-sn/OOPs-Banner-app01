/**
 * HelloName.java - UC2: Command-Line Argument Display.
 * Greets a specific user by name or defaults to World.
 * * @author Divyansh Sanadhya
 * @version 1.0
 */
public class HelloName {
    public static void main(String[] args) {
        // Step 1: Check if any argument was passed to avoid errors
        if (args.length > 0) {
            // Step 2: Access the first argument provided in the terminal
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Step 3: Fallback if no name is provided
            System.out.println("Hello, World!");
        }
    }
}