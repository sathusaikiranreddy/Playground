import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner input = new Scanner(System.in);
  		int num = input.nextInt();
      int pre=0;
      for(int row = 1; row <= num; row++)
      {
        for(int col = 1; col <=row ; col++)
        {
          pre=pre+1;
          if(pre%2==0)
            System.out.print("#");
          else
          System.out.print("*");
        }
         System.out.println();
      }
    }
}