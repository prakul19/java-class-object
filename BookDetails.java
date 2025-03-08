import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();

            // Create object
            Book book = new Book(title, author, price);

            // Display book details
            book.displayDetails();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input, enter correct details.");
        } finally {

        }
    }
}

class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

/*
Sample Input:
Enter book title: Manifest
Enter book author: Roxie Nafousi
Enter book price: 399.99

Sample Output:
Title: Manifest
Author: Roxie Nafousi
Price: 399.99
*/
