import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
      int arrsize = input.nextInt();
      int arr[] = new int[arrsize];
      for(int i = 0 ; i < arrsize;i++)
        arr[i] = input.nextInt();
      int left = 0 ;
      int right= arrsize-1;
      int pal =0;
      while(left < right)
      {
        
        if(arr[left] != arr[right])
        {
          pal = 0;
       break;
        }
        
        else
        {
          pal=1;
          right--;
          left++;
        }
        
      }
      if(pal == 0)
      System.out.println("No");
      else
        System.out.println("Yes");
    }
}