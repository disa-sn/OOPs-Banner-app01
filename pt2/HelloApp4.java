/**
 * HelloApp4.java - UC4: Multiple Command-Line Arguments.
 * Demonstrates: StringBuilder, loops, and defensive programming.
 * * @author Divyansh Sanadhya
 * @version 4.0
 */
public class HelloApp4 {
    public static void main(String[] args) {
        // Step 1: Initialize StringBuilder for memory efficiency
        StringBuilder nameBuilder = new StringBuilder();

        // Step 2: Check if any arguments were provided
        if (args.length > 0) {
            // Step 3: Loop through all arguments and append to builder
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space except for the last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
        } else {
            // Step 4: Fallback to "World" if array is empty
            nameBuilder.append("World");
        }

        // Step 5: Convert builder to string and print the final greeting
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}