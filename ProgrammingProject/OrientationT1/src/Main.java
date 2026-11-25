public class Main {
    public static void main(String[] args){
        ServicePoint sPoint= new ServicePoint();
        CustomerGenerator cGenerator= new CustomerGenerator();
        int customerNum= 5;

        cGenerator.generateCustomers(sPoint, customerNum);
        sPoint.serve();
        sPoint.avgServiceTime(customerNum);
    }
}
