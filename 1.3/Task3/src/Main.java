import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start= reader.nextInt();
        System.out.print("Enter the ending number: ");
        int end= reader.nextInt();

        if (start< end){
            System.out.println("Prime numbers between " + start + " and " + end + " are:");
            for (int num =start ;num<=end ;num++){
                boolean prime= true;
                if (num<2){
                    prime=false;
                }
                else{
                    for(int i=2 ;i <num/i ;i++){
                        if( num% i ==0){
                            prime= false;
                            break;
                        }
                    }
                }
                if (prime){
                    System.out.print(num +" ");
                }
            }

        }


    }
}
