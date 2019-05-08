import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
      int arrsize = input.nextInt();
      int arr[] = new int[arrsize];
      for(int i = 0;i<arrsize;i++)
      {
        arr[i] = input.nextInt();
      }
      int value = input.nextInt();
      for(int i = 0 ;i<arrsize;i++)
      {
        for(int j = i+1;j<arrsize;j++)
        {
          if(arr[i]+arr[j] == value)
            System.out.println(arr[i]+", "+arr[j]);
        }
      }
    }
}