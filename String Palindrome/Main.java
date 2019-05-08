import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
      String str = input.nextLine();
      boolean match = true;
      for(int i = 0 ; i< str.length();i++)
      {
        if(str.charAt(i) != str.charAt(str.length()-1-i))
        {
          match = false;
        }
      }
      if(match == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}