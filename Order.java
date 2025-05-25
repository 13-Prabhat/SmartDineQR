import java.util.HashMap;

public class Order {
    private HashMap<String, Integer> itemsOrdered = new HashMap<>();

    public void addItem(String item, int quantity) {
        itemsOrdered.put(item, quantity);
    }

    public void showOrder() {
        int total = 0;
        System.out.println("\n🧾 Your Order Summary:");
        for (String item : itemsOrdered.keySet()) {
            int qty = itemsOrdered.get(item);
            int price = Menu.getMenuItems().get(item);
            System.out.println(item + " x" + qty + " = ₹" + (price * qty));
            total += price * qty;
        }
        System.out.println("Total Bill: ₹" + total);
        System.out.println("\n✅ Payment simulated successfully!\n");
    }
}