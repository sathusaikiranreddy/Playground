import java.util.Scanner;
class Main{
  static int fun(int num1,int num2,int num3)
  {
    int great=1;
    if(num1>num2)
      great=num1;
    else 
      great=num2;
    if(great<num3)
      great=num3;
    return great;
      
  
  }
	public static void main (String[] args){
	 Scanner input=new Scanner(System.in);
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      int greatest=fun(a,b,c);
      System.out.println(greatest);
     
	}
}