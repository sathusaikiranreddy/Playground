import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
      int arrsize = input.nextInt();
      int arr[] = new int[arrsize];
      //int len = 5;
      for(int i = 0 ; i < arrsize;i++)
        arr[i] = input.nextInt();
      int m = 1,k = 0;
      for(int i = 0 ; i < arrsize;i++)
      {
        for(int j = 0 ; j< arrsize;j++)
        {
          if(m == arr[j])
          {
            k=1;
            break;
          }
          else
            k = 0;
           
        }
        if(k == 0)
          System.out.print(m);
        m++;
      }
      
    }
}