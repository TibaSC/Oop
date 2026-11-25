public class Main {
    public static void main(String[] args){
        ServicePoint sPoint= new ServicePoint();
        CustomerGenerator cGenerator= new CustomerGenerator();

        cGenerator.generateCustomers(sPoint, 5);
        sPoint.serve();
    }
}
