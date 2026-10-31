import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double temp= reader.nextDouble();
        System.out.printf("Temperature in Celsius is %6.1f\n", (temp-32)/1.8);
    }
}
