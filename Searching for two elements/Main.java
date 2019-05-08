import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
     int count1=0,count2=0;
      int size=input.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=input.nextInt();
       int search1=input.nextInt();
      int search2=input.nextInt();
      for(int i=0;i<size;i++)
      {
        if(search1==arr[i])
        {
          count1++;
          System.out.println(i);
        }
         if(search2==arr[i])
         {
           count2++;
           System.out.println(i);
         }
        
      }
      if(count1==0||count2==0)
        System.out.print(-1);
    }
}