/**
 * ==========================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("==========================================");
        System.out.println("   Welcome to Palindrome Checker System   ");
        System.out.println("==========================================");

        // Display application details
        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version          : 1.0");

        // Flow continuation message
        System.out.println("\nSystem initialized successfully.");
        System.out.println("Ready for next use case...");
    }
}