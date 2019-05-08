import java.util.Scanner;
class Main{
  public static void prime(int num)
  {
    
    for(int i=2;i<=num;i++)
    {
     int count=1;
      for(int j=2;j<=i;j++)
      {
         
      if(i%j==0)
        count++;
     
        }
         if(count==2)
      System.out.println(i);
      }
    }
  
	public static void main (String[] args){
	    Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      prime(num);
	}
}