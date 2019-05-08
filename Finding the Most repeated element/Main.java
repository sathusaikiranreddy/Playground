import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    int count = 0 ,max=0,index=0;
    for(int i = 0 ; i < size ;i++)
    {
      arr[i] = input.nextInt();
    }
    for(int i = 0; i< size-1; i++)
    {
      if(arr[i] == arr[i+1])
      {
        count++;
      }
      if(max < count)
      {
        count = max;
        index = i;
      }
      else
        count=0;
    }
    System.out.print(arr[index]);
  }
}