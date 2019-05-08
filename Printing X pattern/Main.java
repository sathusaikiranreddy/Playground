import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      for(int row = 1;row<=num;row++)
      {
        for(int col = 1;col<=num;col++)
        {
          if( row == col ||col+row==num+1)
            System.out.print("*");
      else
          System.out.print(" ");
        }
        System.out.println();
      
      }
	}
}