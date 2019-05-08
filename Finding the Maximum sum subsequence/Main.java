import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    int arr1[] = new int[10];
    int k =0;
    int sum = 0,max = 0;
    for(int i = 0 ;i<size;i++)
    {
      arr[i] = input.nextInt();
    }
    for(int i = 0 ;  i < size-1; i++)
    {
      if(arr[i] <= arr[i+1])
      {
        sum = sum+arr[i];
      }
      
      if(max < sum)
        max = sum;
      else
        sum= 0;
    }
    max = max+arr[size-1];
    System.out.println(max);
  }
}