import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    for(int i = 0 ; i<size;i++)
      arr[i] = input.nextInt();
    int first = size/2;
    int second = first;
    for(int i = 0 ; i < first ; i++)
    {
      for(int j = i+1; j < first ; j++)
      {
        if(arr[i] >arr[j])
        {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i = second ; i < size ; i++)
    {
      for(int j = i+1;j<size;j++)
      {
        if(arr[i] < arr[j])
        {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i = 0 ; i< size;i++)
      System.out.print(arr[i]+" ");
   
  }
}