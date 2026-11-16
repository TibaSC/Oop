import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList= new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void removeItem(String item){
        groceryList.remove(item);
        System.out.println("Removing \""+item+"\" from the list...");
    }

    public void displayList()
    {
        for (String item: groceryList){
            System.out.println((groceryList.indexOf(item)+1)+ ". "+ item);
        }
    }

    public void checkItem(String item){
        System.out.print("Is \"" +item+"\" in the grocery list? ");
        System.out.println(groceryList.contains(item));
    }

    public static void main(String[] args){
        GroceryListManager manager= new GroceryListManager();

        manager.addItem("Apple");
        manager.addItem("Milk");
        manager.addItem("Bread");

        System.out.println("Grocery List:");
        manager.displayList();

        System.out.println();
        manager.checkItem("Milk");

        System.out.println();
        manager.removeItem("Milk");

        System.out.println();
        System.out.println("Updated Grocery List:");
        manager.displayList();
    }
}
