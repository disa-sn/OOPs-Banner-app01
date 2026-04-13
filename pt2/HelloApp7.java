package com.bridgelabz.helloapp;

/**
 * HelloApp7.java - UC7: Multiple Arguments using String.join().
 * This is the most concise version, leveraging built-in Java utilities.
 * * @author Divyansh Sanadhya
 * @version 7.0
 */
public class HelloApp7 {
    public static void main(String[] args) {
        // Step 1: Handle default value if no arguments are provided
        String names = "World";

        // Step 2: Use String.join() to handle all names and commas automatically
        if (args.length > 0) {
            // String.join(delimiter, array) places the delimiter ONLY between elements
            names = String.join(", ", args);
        }

        // Step 3: Print the final message
        System.out.println("Hello, " + names + "!");
    }
}