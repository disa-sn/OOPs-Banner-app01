/**
 * UC4PrintBanner – Banner Display Application (Use Case 4)
 * This class improves upon UC3 by using a String array and a loop
 * to eliminate repetitive print statements.
 * @author Divyansh Sanadhya
 * @version 4.0
 */
public class UC4PrintBanner {
    public static void main(String[] args) {
        // 1. Create a String array to store all 7 lines of the OOPS banner
        String[] bannerLines = new String[7];

        // 2. Populate the array using String.join() for each line
        bannerLines[0] = String.join(" ", "  ***** ", "  ***** ", " ******* ", "  ***** ");
        bannerLines[1] = String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** ");
        bannerLines[2] = String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** ");
        bannerLines[3] = String.join(" ", " ** ** ", " ** ** ", " ******* ", "  ***** ");
        bannerLines[4] = String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** ");
        bannerLines[5] = String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** ");
        bannerLines[6] = String.join(" ", "  ***** ", "  ***** ", " ** ", "  ***** ");

        // 3. Use an enhanced for-loop to iterate and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}