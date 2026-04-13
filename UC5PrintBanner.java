/**
 * UC5PrintBanner – Banner Display Application (Use Case 5)
 * This class optimizes UC4 by using inline array initialization
 * for better code conciseness and maintainability.
 * @author Divyansh Sanadhya
 * @version 5.0
 */
public class UC5PrintBanner {
    public static void main(String[] args) {
        // 1. Declare and initialize the String array in a single compact statement
        String[] lines = {
            String.join(" ", "  ***** ", "  ***** ", " ******* ", "  ***** "),
            String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join(" ", " ** ** ", " ** ** ", " ******* ", "  ***** "),
            String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** "),
            String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** "),
            String.join(" ", "  ***** ", "  ***** ", " ** ", "  ***** ")
        };

        // 2. Use an enhanced for-loop for clean output traversal
        for (String line : lines) {
            System.out.println(line);
        }
    }
}