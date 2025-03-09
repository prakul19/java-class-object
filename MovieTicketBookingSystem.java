import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter movie name: ");
            String movieName = scanner.nextLine();
            System.out.print("Enter seat number: ");
            int seatNumber = scanner.nextInt();
            System.out.print("Enter ticket price: ");
            double price = scanner.nextDouble();

            // Create MovieTicket object and book the ticket
            MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

            // Display ticket details
            ticket.displayDetails();
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input! Please enter the correct details.");
        } finally {
            scanner.close();
        }
    }
}

class MovieTicket {
    // Attributes
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

/*
Sample Input:
Enter movie name: Interstellar
Enter seat number: 42
Enter ticket price: 499

Sample Output:
Movie Name: Interstellar
Seat Number: 42
Price: 499
*/
