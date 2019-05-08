import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i<size;i++)
    {
      arr[i] = input.nextInt();
    }
    int count = 0;
    for(int i = 0 ;i < size ; i++)
    {
      if(arr[i] == size)
      {
        count = 1;
      }
    }
   
     if(count != 1)
      System.out.println("Perfect Batch");
     else
      System.out.println("Not a Perfect Batch");
    
  }
}