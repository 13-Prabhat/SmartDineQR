import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.println("📋 Welcome to SmartDineQR!");
        System.out.println("📱 You scanned Table 1 QR Code.\n");

        System.out.println("Here’s the menu:");
        Menu.getMenuItems().forEach((item, price) -> {
            System.out.println(item + " - ₹" + price);
        });

        String choice;
        do {
            System.out.print("\nEnter item name to order: ");
            String item = scanner.nextLine();
            if (!Menu.getMenuItems().containsKey(item)) {
                System.out.println("❌ Item not on menu!");
                continue;
            }
            System.out.print("Enter quantity: ");
            int qty = Integer.parseInt(scanner.nextLine());
            order.addItem(item, qty);
            System.out.print("Add more? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        order.showOrder();
        System.out.println("🍽️ Your order will be served shortly!");
    }
}