import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList= new HashMap<>();

    public void addItem(String item, double cost){
        groceryList.put(item, cost);
    }

    public void removeItem(String item){
        groceryList.remove(item);
        System.out.println("Removing \""+item+"\" from the list...");
    }

    public void displayList()
    {
        for (Map.Entry<String, Double> item: groceryList.entrySet()){
            System.out.println(item.getKey()+ " - "+ item.getValue()+ " €");
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

    public static void main(String[] args){
        GroceryListManager manager= new GroceryListManager();

        manager.addItem("Apple", 2);
        manager.addItem("Milk", 2);
        manager.addItem("Bread", 2);

        System.out.println("Grocery List:");
        manager.displayList();

        System.out.println();
        manager.checkItem("Milk");

        System.out.println();
        manager.removeItem("Milk");

        System.out.println();
        System.out.println("Updated Grocery List:");
        manager.displayList();

        System.out.println();
        System.out.println("Total cost: " + manager.calculateTotalCost() + " €");
    }
}
