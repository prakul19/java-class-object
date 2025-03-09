import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input text
            System.out.print("Enter text to check if it's a palindrome: ");
            String text = scanner.nextLine();

            // Create PalindromeChecker object
            PalindromeChecker checker = new PalindromeChecker(text);

            // Check and display result
            checker.displayResult();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input! Please enter valid text.");
        } finally {
            scanner.close();
        }
    }
}

// PalindromeChecker class definition
class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

/*
Sample Input:
Enter text to check if it's a palindrome: my gym

Sample Output:
The text "my gym" is a palindrome.
*/
