import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int k = input.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++)
      {
        arr[i] = input.nextInt();
      }
      int f[] = new int[k];
      for(int i = 0; i<=n-1;i++)
      {
        f[arr[i]-1]++;
      }
      for(int i = 0 ;i<=k-1;i++)
        System.out.println((i+1)+" "+f[i]);
    }
}