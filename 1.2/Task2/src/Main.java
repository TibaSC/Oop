import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.print("Enter the length of the first leg: ");
        double leg1= reader.nextDouble();

        System.out.print("Enter the length of the first leg: ");
        double leg2= reader.nextDouble();

        System.out.printf("The hypotenuse is %.2f", Math.sqrt(Math.pow(leg1,2)+Math.pow(leg2,2)));
    }
}
