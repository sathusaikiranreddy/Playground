import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    for(int i = 0 ; i < size ; i++)
      arr[i] = input.nextInt();
    for(int i = 0 ; i < size; i++)
    {
      for(int j = i ; j < size; j++)
      {
        if(arr[i] < arr[j])
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
  }
}