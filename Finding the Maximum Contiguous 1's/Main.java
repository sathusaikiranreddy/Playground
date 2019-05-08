import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    int count = 0 ;
    for(int i = 0 ; i < size ;i++)
    {
      arr[i] = input.nextInt();
    }
     for(int i = 0 ; i < size ;i++)
    {
       if(arr[i] == 1)
       {
         count++;
       }
       else
         break;
     }
    System.out.print(count);
    	
    }
}