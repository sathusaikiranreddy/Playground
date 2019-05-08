import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      for(int row=1;row<=num;row++)
      {
        for(int col=1;col<=num;col++)
        {
          if(row%2==1){
          if(col==num)
            System.out.print(row+1);
          else
            System.out.print(row);
          }
          if(row%2==0)
          {
            if(col==1)
              System.out.print(row+1);
            else
              System.out.print(row);
          
          }
            
        
        }
        System.out.println();
      
      }
	}
}