/**
 * UC2PrintBanner – ASCII Banner Display Application
 * This class renders the "OOPS" banner using 7 lines of asterisks.
 * @author Divyansh Sanadhya
 * @version 2.0
 */
public class UC2PrintBanner {
    public static void main(String[] args) {
        // Each line uses concatenation (+) to join the patterns for O, O, P, and S
        System.out.println("  ***** " + "  ***** " + " ******* " + "  ***** ");
        System.out.println(" ** ** " + " ** ** " + " ** ** " + " ** ");
        System.out.println(" ** ** " + " ** ** " + " ** ** " + " ** ");
        System.out.println(" ** ** " + " ** ** " + " ******* " + "  ***** ");
        System.out.println(" ** ** " + " ** ** " + " ** " + "      ** ");
        System.out.println(" ** ** " + " ** ** " + " ** " + "      ** ");
        System.out.println("  ***** " + "  ***** " + " ** " + "  ***** ");
    }
}