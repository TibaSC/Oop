import java.util.ArrayList;
import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue= new LinkedList<>();
    private LinkedList<Double> avg= new LinkedList<>();

    public void addToQueueue(Customer a){
        queue.addFirst(a);
    }
    public Customer removeFromQueueue(){
        return queue.removeLast();
    }
    public void serve(){
        while(!queue.isEmpty()){
            Customer customer = removeFromQueueue();
            long sleeptime = (long) (Math.random() * 3000 + 1000);
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                return;
            }

            customer.setEndTime();
            double serviceTime =sleeptime/1000.0;
            avg.add(serviceTime);
            double timeSpent= customer.getTimeSpent();
            double responseTime= serviceTime + timeSpent;

            System.out.println("Customer ID: "+ customer.getId());
            System.out.println("Response time: "+ responseTime + "s");
            System.out.println("Time spent in the service: "+ serviceTime + "s");
        }

    }

    public void avgServiceTime(double customers){
        double sum=0;
        for(double num: avg){
            sum+= num;
        }
        System.out.println("Average service time: "+sum /customers+ "s");
    }
}
