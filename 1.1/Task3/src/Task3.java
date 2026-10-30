import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());
        int sum= first + second + third;
        int product= first* second* third;
        float avr= (float)sum /3;
        System.out.println("The sum of the numbers is " + sum +", the product "+ product+", and the average "+ avr+".");

    }
}
