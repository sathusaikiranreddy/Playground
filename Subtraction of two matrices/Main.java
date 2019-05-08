import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    int col = input.nextInt();
    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    for(int i = 0 ;i<row;i++ )
    {
      for(int j = 0 ; j< col;j++)
      {
        mat1[i][j] =  input.nextInt();
      }
    }
      for(int i = 0 ;i<row;i++ )
    {
      for(int j = 0 ; j< col;j++)
      {
        mat2[i][j] =  input.nextInt();
      }
    }
      for(int i = 0 ;i<row;i++ )
    {
      for(int j = 0 ; j< col;j++)
      {
        mat1[i][j] =  mat1[i][j]-mat2[i][j];
      }
    }
    
      for(int i = 0 ;i<row;i++ )
    {
      for(int j = 0 ; j< col;j++)
      {
        System.out.print(mat1[i][j]+" ");
      }
        System.out.println();
    }
  }
}