import java.util.Scanner;
public class Main{
  static int fun(int a, int b, int c)
  {
    int min=1,gcd=1,k=1;
    if(a<b)
      min=a;
    else
      min=b;
    if(min>c)
      min=c;
    
    while(min>=1)
          {
    if( a % min == 0 && b % min==0 && c % min == 0)
    {
      gcd=min;
        break;
    }
      min--;
  }
    return gcd;
  }
	public static void main (String[] args)
	{
	 Scanner input=new Scanner(System.in);
      int num1=input.nextInt();
      int num2=input.nextInt();
      int num3=input.nextInt();
      int gcd=fun(num1,num2,num3);
      System.out.println(gcd);
	}
}