import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size= reader.nextInt();
        int[] array= new int[size];
        int[] newArray= new int[size];

        System.out.println("Enter the integers into the array:");
        for(int i = 0; i<size;i++){
            System.out.print("Enter integer "+(i+1)+": ");
            int num= reader.nextInt();

            boolean exists = false;
            for(int numbers=0;numbers< i;numbers++){
                if(num== array[numbers]){
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                array[i]= num;
            }
        }
        for(int newNum:array){
            if(newNum !=0){
                System.out.print(newNum +" ");
            }
        }
    }
}
