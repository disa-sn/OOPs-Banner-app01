/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC1 by accepting a user's name as a command-line argument and 
 * displaying a personalized greeting.
 * * UC 1: Display "Hello World" - Displays static message.
 * UC 2: Display User Name - Accepts name via command-line and greets.
 * * @author Divyansh Sanadhya
 * @version 1.0
 * @since UC1
 */
public class HelloApp {
    /**
     * Main method - Entry point of the application.
     * @param args Command-line arguments. args[0] is expected to be the name.
     */
    public static void main(String[] args) {
        // Checking array length to prevent ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            // Accessing the first argument via index 0
            String name = args[0];
            // Combining strings using the + operator
            System.out.println("Hello, " + name + "!");
        } else {
            // Providing a fallback/default value for safety
            System.out.println("Hello, World!");
        }
    }
}