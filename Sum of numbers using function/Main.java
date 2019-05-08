import java.util.Scanner;
class Main{
  public static int m(int num)
  {
     int k=0;
    while(num>0){
   
    k=k+num;
    num--;
  }
    return k;
  }
	public static void main (String[] args){
	  Scanner input=new Scanner(System.in);
      int num=input.nextInt();
      int sum=1;
    
       sum=m(num);
      
      System.out.println(sum);
      
	}
}