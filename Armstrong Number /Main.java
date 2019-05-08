import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int arm = 0 , count = 0;
      for(int i = num; i > 0; i=i/10)
      {
        ++count;    
      }
     // System.out.println(count);
      for(int i = num; i > 0; i=i/10)
      {
        int rem = i % 10;  
        if(count==3)
        arm = arm + (rem*rem*rem);
        else if(count==4)
          arm=arm+(rem*rem*rem*rem);
        /*
        for(int j= 1;j<=count;j++)
        arm= (count*rem)+arm;
        */
      }
     if(num == arm)
       System.out.println("Armstrong Number ");
      else
        System.out.println("Not a Armstrong Number");
	}
      
}