import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i < size ; i++)
      arr[i] = input.nextInt();
    int sz = size/2;
    for(int i = 0 ; i<sz;i++)
    {
      for(int j = i+1;j<sz;j++)
      {
        if(arr[i] >arr[j])
        {
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j]  = temp;
        }
      }
    }
    for(int i = 0 ; i<size;i++)
    System.out.print(arr[i]+" ");
  }
}