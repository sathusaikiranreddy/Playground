import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=input.nextInt();
      }
      int large=arr[0];
      for(int i=0;i<size-1;i++)
      {
       if(large<arr[i+1])
        large=arr[i+1];
       
      }
      System.out.println(large);
      
    }
}