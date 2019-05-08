import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      for(int row=num; row>=1;row--)
      {
        for(int col= row ; col>=1;col--)
          System.out.print(col);
        System.out.println();
      }
	}
}