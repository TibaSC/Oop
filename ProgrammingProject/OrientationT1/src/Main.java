public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setStartTime(1000);
        customer1.setEndTime(5000);
        customer2.setStartTime(2000);
        customer2.setEndTime(8000);

        System.out.println("Customer ID:" + customer1.getId());
        System.out.println("Start time: " + customer1.getStartTime());
        System.out.println("End time: " + customer1.getEndTime());
        System.out.println("Time spent: " + customer1.getTimeSpent());

        System.out.println();

        System.out.println("Customer ID: " + customer2.getId());
        System.out.println("Start time: " + customer2.getStartTime());
        System.out.println("End time: " + customer2.getEndTime());
        System.out.println("Time spent: " + customer2.getTimeSpent());
    }
}
