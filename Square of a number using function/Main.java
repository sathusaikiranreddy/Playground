import java.util.Scanner;
class Main
{
  public static int m(int num)
  {
    int s=num*num;
    return s;
  
  }
	public static void main (String[] args)
    {
	 Scanner input =new Scanner(System.in);
      int num=input.nextInt();
      int sq=m(num);
      System.out.println(sq);
	} 
}