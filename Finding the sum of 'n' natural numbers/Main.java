import java.util.Scanner;
class Main {
  public static int sum(int num)
  {
    if(num == 1)
      return 1;
    else
      return num+sum(num-1);
  }
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
      int num = input.nextInt();
     System.out.println( sum(num));
    }
}