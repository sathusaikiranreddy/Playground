import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int rmax= num-1,cmax = num-1,rmin=0,cmin=0;
      int arr[][] = new int[num][num];
      int val=1;
      while(rmax>=rmin&&cmax>=cmin)
      {
        for(int i = rmax;i>=rmin;i--)
          arr[rmin][i] = val++;
        for(int i = rmin+1; i<=rmax;i++)
          arr[i][cmin] = val++;
        for(int i = cmin+1; i<=cmax;i++)
          arr[rmax][i]=val++;
        for(int i = rmax-1 ; i >= rmin+1;i-- )
          arr[i][cmax] = val++;
        rmin++;
        rmax--;
        cmin++;
        cmax--;
      }
      for(int i = 0;i<num;i++)
      {
        for(int j = 0 ; j< num; j++)
          System.out.print(arr[i][j]+" ");
        System.out.println();
      }
    }
}