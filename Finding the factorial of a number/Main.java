import java.util.Scanner;
class Main
{
  public static int fact(int num)
  {
    if(num == 0)
      return 1;
    else
      return num*fact(num-1);
  }
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println(fact(num));
    // your code here
  }
}