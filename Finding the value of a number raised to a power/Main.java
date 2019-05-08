import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner input = new Scanner(System.in);
      int base = input .nextInt();
      int exponent = input .nextInt();
      int result =1;
      while(exponent >0)
      {
        result = result*base;
        exponent--;
      }
      System.out.println(result);
    }
}