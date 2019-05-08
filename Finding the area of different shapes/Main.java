import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner input = new Scanner(System.in);
      
        int i = input.nextInt();
      switch(i)
      {
        case 1:
          int j = input.nextInt();
          System.out.println(4*j);
          break;
        case 2:
          j = input.nextInt();
          int k = input.nextInt();
          System.out.println(j*k);
          break;
          case 3:
           j = input.nextInt();
           k = input.nextInt();
          System.out.println(j*k/2);
          break;
        case 4:
           j = input.nextInt();
          System.out.println(3.14*j*j);
          break;
          
      }
    }
}