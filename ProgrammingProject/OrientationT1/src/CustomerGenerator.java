public class CustomerGenerator {
    public void generateCustomers(ServicePoint sPoint, int customersNum){
        for (int i=0; i < customersNum; i++){
            Customer customer= new Customer();
            customer.setStartTime();
            sPoint.addToQueueue(customer);
        }
    }
}
