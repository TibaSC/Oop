import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.print("Weight (g): ");
        int g= reader.nextInt();

        double luoti= g / 13.28;
        int leiviska= (int)luoti/(20*32);
        luoti= luoti%(20*32);
        int naula= (int)luoti/ 32;
        luoti= luoti%32;

        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti.",
                g, leiviska, naula, luoti);
    }
}
