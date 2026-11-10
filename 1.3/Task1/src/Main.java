import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.print("a: ");
        double a= reader.nextDouble();
        System.out.print("b: ");
        double b= reader.nextDouble();
        System.out.print("c: ");
        double c= reader.nextDouble();

        double sqrt=Math.pow(b,2)-(4*a*c);
        double xP=(-b+ Math.sqrt(sqrt)) / (2*a);
        double xN=(-b- Math.sqrt(sqrt)) / (2*a);

        if (sqrt >=0){
            System.out.print("x= "+xP+ " ,");
            System.out.print("x= "+xN);
        }
        else{
            System.out.println("No real roots");
        }
        
    }
}
