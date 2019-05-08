import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int largest = 0,index = 0;
    int arr[] = new int[size];
    for(int i = 0; i < size ;i++)
    {
      arr[i] =  input.nextInt();
    }
    for(int i = 0 ; i < size;i++)
    {
      if(arr[i] > largest)
      {
      largest = arr[i];
      index = i;
      }
      
    }
    System.out.print(index);
  }
}