import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      for( int i = 1; i <=2* num;i++ )
      {
      if( i%2 == 1 )
      {
        System.out.println(i);
     
      }
  
      }
    
	}
}