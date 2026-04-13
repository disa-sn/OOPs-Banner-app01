package com.bridgelabz.helloapp;

/**
 * HelloApp6.java - UC6: Multiple Arguments with Substring Cleanup.
 * Demonstrates: Enhanced for-loop, StringBuilder, and substring() method.
 * * @author Divyansh Sanadhya
 * @version 6.0
 */
public class HelloApp6 {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        // Step 1: Default handling if no arguments are provided
        if (args.length == 0) {
            nameBuilder.append("World");
        } else {
            // Step 2: Append every name followed by a delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 3: Remove the trailing delimiter (", ") using substring
            // We only do this if the builder isn't empty to prevent errors
            if (nameBuilder.length() > 0) {
                String fullNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                nameBuilder.setLength(0); // Clear builder
                nameBuilder.append(fullNames); // Re-add the cleaned string
            }
        }

        // Step 4: Display the final result
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}