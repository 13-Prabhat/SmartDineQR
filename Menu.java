import java.util.HashMap;

public class Menu {

    public static HashMap<String, Integer> getMenuItems() {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Pizza", 150);
        menu.put("Burger", 80);
        menu.put("Pasta", 120);
        menu.put("Fries", 60);
        menu.put("Coffee", 50);
        return menu;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> items = getMenuItems();
        for (String item : items.keySet()) {
            System.out.println(item + " : ₹" + items.get(item));
        }
    }
}
