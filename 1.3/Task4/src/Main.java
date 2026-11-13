import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int program= program();
        while (program!= 10){
            System.out.println("Try again!");
            program = program();
        }
        System.out.println("Congrats you've mastered the multiplication tables.");
    }
    public static int program(){
        Scanner reader= new Scanner(System.in);
       int points= 0;
       for (int i = 0; i<10; i++){
           int luku = (int) (Math.random() * 10) + 1;
           int luku2 = (int) (Math.random() * 10) + 1;

           System.out.print(luku+ "x"+ luku2+": ");
           int answer= reader.nextInt();
           if(answer== (luku*luku2)){
               points++;
               System.out.println("Correct!");
           }
           else {
               System.out.println("Incorrect!");
           }
       }
       return points;
    }
}
