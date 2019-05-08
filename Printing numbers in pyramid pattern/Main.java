import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int n=1;
      for(int row=1;row<=num;row++)
      {
        for(int space=1;space<=num-row;space++)
          System.out.print(" ");
        for(int col=1;col<= row;col++)
        {
          System.out.print(n+" ");
        n=n+1; 
        }
        System.out.println();
      }
      
    }    
}