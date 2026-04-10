package com.bridgelabz.helloapp;

/**
 * HelloApp5.java - UC5: Multiple Arguments using Enhanced For Loop.
 * Demonstrates: For-each loop, StringBuilder, and packaging.
 * * @author Divyansh Sanadhya
 * @version 5.0
 */
public class HelloApp5 {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        // Step 1: Handle the "No Input" default case
        if (args.length == 0) {
            nameBuilder.append("World");
        } else {
            // Step 2: Use Enhanced For-Loop for cleaner iteration
            boolean first = true;
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }
        }

        // Step 3: Display the final formatted message
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}