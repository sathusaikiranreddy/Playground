import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
   
   try{
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
        System.out.println(num);
   }  
     catch(Exception ex)
     {
       System.out.println("Input Mismatch Exception occurred");
     }
    
   }
}