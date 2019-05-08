import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();
    int count = 0;
     boolean match = true;
    for(int i = 0 ; i < str1.length()-str2.length()+1;i++)
    {
     
      for(int j = 0 ; j < str2.length() ;j++)
      {
        if(str1.charAt(i+j) != str2.charAt(j))
          match = false;
        else
          match = true;
      }
      if(match == true )
        count++;
    }
    System.out.println(count);
    
  } 
}