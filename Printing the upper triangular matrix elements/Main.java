import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    int col = input.nextInt();
    int mat[][] = new int[row][col];
    for(int i = 0 ; i< mat.length;i++)
    {
      for(int j = 0 ; j< mat[i].length;j++)
      {
        mat[i][j] = input.nextInt();
      }
    }
    for(int i = 0 ; i< row;i++)
    {
      for(int j = 0 ; j<col;j++)
      {
        if(j == i)
          System.out.print(mat[i][j]+" ");
        
      }
    }
     for(int i = 0 ; i< row;i++)
    {
      for(int j = 0 ; j<col;j++)
      {
        if(j == i+1)
          System.out.print(mat[i][j]+" ");
      }
     }
     for(int i = 0 ; i< row;i++)
    {
      for(int j = 0 ; j<col;j++)
      {
        if(j == i+2)
          System.out.print(mat[i][j]+" ");
      }
     }
    
    //  System.out.println();
    }
  }
