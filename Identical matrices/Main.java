import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    int col = input.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    boolean match = true;
    int k = 0;
    for(int i = 0 ; i< mat1.length;i++)
    {
      for(int j = 0 ; j< mat1[i].length;j++)
      {
        mat1[i][j] = input.nextInt();
      }
    }
    for(int i = 0 ; i< mat2.length;i++)
    {
      for(int j = 0 ; j< mat2[i].length;j++)
      {
        mat2[i][j] = input.nextInt();
      }
    }
     for(int i = 0 ; i< row;i++)
    {
      for(int j = 0 ; j< col;j++)
      {
        if(mat1[i][j] != mat2[i][j])
        {
          match = false;
          break;
         // k++;
        }
        
      
      }
     }
    int m = row*col;
    if(match == true)
      System.out.print("Yes");
    else
     System.out.print("No");
  }
}