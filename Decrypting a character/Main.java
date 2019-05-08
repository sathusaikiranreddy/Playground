import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
      char ch = input.next().charAt(0);
      int key = input.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        int offset = ch - 'a';
        offset = (offset - key)+(26-offset);
        ch = (char)(ch+offset);
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - 'A';
        offset = (offset - key)/26-key;
        ch = (char)(ch + offset);
        
      }
      System.out.println(ch);
    }
}