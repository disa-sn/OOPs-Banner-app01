import java.util.HashMap;
import java.util.Map;

/**
 * UC8 – OOPS Banner App: Map Collection Implementation
 * This final version utilizes the Java Collections Framework (HashMap) 
 * for instant O(1) character lookups and a highly modular design.
 * @author Divyansh Sanadhya
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Create the data structure to store character patterns
        Map<Character, String[]> charMap = createCharacterMap();

        // 2. The message you want to display
        String message = "OOPS";

        // 3. Render the message horizontally
        displayBanner(message, charMap);
    }

    /**
     * Initializes a HashMap with stylized ASCII patterns for 'O', 'P', 'S', and space
     */
    public static Map<Character, String[]> createCharacterMap() {
        Map<Character, String[]> charMap = new HashMap<>();

        // Use 'put' to map characters to their 7-line patterns
        charMap.put('O', new String[]{"  *** ", " ** **", " ** **", " ** **", " ** **", " ** **", "  *** "});
        charMap.put('P', new String[]{" ****** ", " ** ** ", " ** ** ", " ****** ", " ** ", " ** ", " ** "});
        charMap.put('S', new String[]{"  ***** ", " ** ", " ** ", "  *** ", "    ** ", "    ** ", " ***** "});
        charMap.put(' ', new String[]{"    ", "    ", "    ", "    ", "    ", "    ", "    "});

        return charMap;
    }

    /**
     * Renders the message as a stylized banner using nested loops and StringBuilder
     */
    public static void displayBanner(String message, Map<Character, String[]> charMap) {
        int patternHeight = 7; // Every character is exactly 7 lines tall

        // Outer Loop: Iterate through each of the 7 horizontal rows
        for (int row = 0; row < patternHeight; row++) {
            StringBuilder sb = new StringBuilder(); // Professional way to assemble strings
            
            // Inner Loop: Iterate through each character in the message
            for (char ch : message.toCharArray()) {
                // Instantly retrieve the pattern array for the character
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[row]).append("  "); // Append the specific row with spacing
            }
            // Print the fully assembled row to the console
            System.out.println(sb.toString());
        }
    }
}