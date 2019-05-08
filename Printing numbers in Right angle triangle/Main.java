import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      for(int row = 1; row <= num; row++)
      {
        for(int col = 1; col <= row; col++)
          System.out.print(row);
        System.out.println();
      }
	}
}