import java.util.Scanner;
class Main{
  public static int fun(int num1,int num2)
  {
    int res=1;
    for(int i=1;i<=num2;i++)
    {
    res = res*num1;
    }
  return(res);
  }
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
      int base = input.nextInt();
      int power = input.nextInt();
      int res=fun(base,power);
      System.out.println(res);
      
	}
}