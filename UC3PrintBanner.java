/**
 * UC3PrintBanner – Banner Display Application (Use Case 3)
 * This class refactors UC2 to use String.join() for better memory efficiency.
 * @author Divyansh Sanadhya
 * @version 3.0
 */
public class UC3PrintBanner {
    public static void main(String[] args) {
        // Constructing each line using String.join() with an empty space delimiter
        System.out.println(String.join(" ", "  ***** ", "  ***** ", " ******* ", "  ***** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", " ** ** ", " ** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", " ******* ", "  ***** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** "));
        System.out.println(String.join(" ", " ** ** ", " ** ** ", " ** ", "      ** "));
        System.out.println(String.join(" ", "  ***** ", "  ***** ", " ** ", "  ***** "));
    }
}