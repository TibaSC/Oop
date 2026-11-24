import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner reader = new Scanner(System.in);

        boolean running = true;
        while (running){
            System.out.println("\n1. Queue a customer");
            System.out.println("2. Dequeue a customer");
            System.out.println("3. Exit");
            System.out.print("Choose an action: ");

            int choice= reader.nextInt();
            switch(choice){
                case 1:
                    Customer customer= new Customer();
                    customer.setStartTime();
                    queue.addFirst(customer);

                    System.out.println("Customer "+ customer.getId()+ " added to the queue.");
                    break;

                case 2:
                    Customer removed= queue.removeLast();
                    removed.setEndTime();
                    System.out.println("Customer "+ removed.getId()+ " removed from the queue.");
                    System.out.println("Time spent in queue: "+ removed.getTimeSpent()+ " seconds");
                    break;

                case 3:
                    running= false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
