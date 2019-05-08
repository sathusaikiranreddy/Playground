import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int arrsize = input.nextInt();
      int arr[] = new int[arrsize];
      int arr1[] = new int[arrsize];
      for(int i = 0 ; i<arrsize;i++)
      arr[i] = input.nextInt();
      int count = 0;
      for(int i = 0 ;i<arrsize;i++)
      {
        if(arr[i] != 0)
        {
          arr1[count]=arr[i];
        count = count+1;
        }
        
      }
      for(int i = 0 ;i<arrsize;i++)
        System.out.print(arr1[i]+" ");
    }
}