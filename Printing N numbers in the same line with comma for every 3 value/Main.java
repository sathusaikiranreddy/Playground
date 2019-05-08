import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int com = 3;
    for(int count = 1; count <= num; count++)
    {
    System.out.print(count);
      if(count%com == 0 && count!=num)
        System.out.print(",");
    }
  }
}