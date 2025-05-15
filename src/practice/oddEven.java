package practice;
import java.util.Scanner;

//Write a Java program to check if a number is even or odd.

public class oddEven {

    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
            int num= input.nextInt();

             if(num%2==0){
                 System.out.print("It is even number");
            }
             else{
                 System.out.print("It is odd number");
             }


      input.close();

    }
}
