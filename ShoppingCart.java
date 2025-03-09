import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    cart.add(new CartItem(itemName, price, quantity));
                    System.out.println("Item added to cart!");
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItemName = scanner.nextLine();
                    boolean removed = false;
                    for (CartItem item : cart) {
                        if (item.getItemName().equalsIgnoreCase(removeItemName)) {
                            cart.remove(item);
                            System.out.println("Item removed from cart!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Item not found in cart!");
                    }
                    break;
                case 3:
                    double totalCost = 0;
                    for (CartItem item : cart) {
                        totalCost += item.getPrice() * item.getQuantity();
                    }
                    System.out.println("Total Cost: " + totalCost);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
        scanner.close();
    }
}

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

/*
Sample Input:
1. Add Item
Enter item name: Apple
Enter item price: 10
Enter item quantity: 10

2. Add Item
Enter item name: Banana
Enter item price: 5
Enter item quantity: 5

3. Display Total Cost

Sample Output:
Item added to cart!
Item added to cart!
Total Cost: 125
*/
