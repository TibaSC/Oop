import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList= new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();

    public void addItem(String item, double cost, String category){
        groceryList.put(item, cost);
        categories.put(item, category);

    }

    public void removeItem(String item){
        groceryList.remove(item);
        categories.remove(item);

        System.out.println("Removing \""+item+"\" from the list...");
    }

    public void displayList()
    {
        for (String item : groceryList.keySet()){
            System.out.println(item + " - " + groceryList.get(item) + " € - " + categories.get(item));
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

        manager.addItem("Apple", 2,"Fruits");
        manager.addItem("Milk", 2, "Dairy");
        manager.addItem("Bread", 2,"Backery");

        System.out.println("Grocery List:");
        manager.displayList();

        System.out.println();
        manager.displayByCategory("Fruits");

        System.out.println();
        System.out.println("Total cost: " + manager.calculateTotalCost() + " €");
    }
}
