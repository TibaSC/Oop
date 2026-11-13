import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] firstNames= {"Tiba","Leo", "Emma", "Sophia", "Oliver", "Felix"};
        String[] lastNames= {"Anderson", "Bennett", "Carter", "Mitchell", "Parker", "Sullivan"};

        Scanner reader= new Scanner(System.in);
        Random random= new Random();

        System.out.print("How many random names the program should generate? ");
        int num= reader.nextInt();

        for (int i = 0; i< num; i++){
            int rndFirst= random.nextInt(0,6);
            int rndLast= random.nextInt(0,6);
            System.out.println(firstNames[rndFirst]+ " "+ lastNames[rndLast]);
        }

    }
}
