import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList= new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    private HashMap<String, Integer> quantities = new HashMap<>();


    public void addItem(String item, double cost, String category, int quantity){
        groceryList.put(item, cost);
        categories.put(item, category);
        quantities.put(item, quantity);
    }

    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
        }
    }

    public void displayAvailableItems() {
        for (String item : quantities.keySet()) {
            if (quantities.get(item) > 0) {
                System.out.println(item + " - Quantity: " + quantities.get(item));
            }
        }
    }

    public void removeItem(String item){
        groceryList.remove(item);
        categories.remove(item);
        quantities.remove(item);

        System.out.println("Removing \""+item+"\" from the list...");
    }

    public void displayList()
    {
        for (String item : groceryList.keySet()){
            System.out.println(item + " - " + groceryList.get(item) + " € - " + categories.get(item)+ " - Quantity: " + quantities.get(item));
        }
    }
    public void checkItem(String item){
        System.out.print("Is \"" +item+"\" in the grocery list? ");
        System.out.println(groceryList.containsKey(item));
    }
    public double calculateTotalCost(){
        double total = 0;

        for (double cost : groceryList.values()) {
            total += cost;
        }

        return total;
    }

    public void displayByCategory(String category) {
        System.out.println("Items in " + category + ":");

        for (String item : categories.keySet()) {
            if (categories.get(item).equals(category)) {
                System.out.println(item + " - " + groceryList.get(item) + " €");
            }
        }
    }

    public static void main(String[] args){
        GroceryListManager manager= new GroceryListManager();

        manager.addItem("Apple", 2,"Fruits", 5);
        manager.addItem("Milk", 2, "Dairy", 7);
        manager.addItem("Bread", 2,"Backery", 11);

        System.out.println("Grocery List:");
        manager.displayList();

        System.out.println();
        manager.updateQuantity("Milk", 4);

        System.out.println("Available Items:");
        manager.displayAvailableItems();
    }
}
