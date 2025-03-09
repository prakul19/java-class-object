import java.util.Scanner;

public class InventoryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter item code: ");
            int itemCode = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter item price: ");
            double price = scanner.nextDouble();
            Item item = new Item(itemCode, itemName, price);

            // Display item details
            item.displayDetails();

            // Input quantity and calculate total cost
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            double totalCost = item.calculateTotalCost(quantity);
            System.out.println("Total cost for " + quantity + " items: " + totalCost);
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Invalid input! Please enter the correct details.");
        } finally {
            scanner.close();
        }
    }
}

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

/*
Sample Input:
Enter item code: 1
Enter item name: Pen
Enter item price: 10
Enter quantity: 3

Sample Output:
Item Code: 1
Item Name: Pen
Price: 10
Total cost for 3 items: 30
*/
