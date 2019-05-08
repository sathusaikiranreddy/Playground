import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner input = new  Scanner(System.in);
    String str = input.nextLine();
    StringBuilder sb= new StringBuilder(str);
    int key = input.nextInt();
    for(int i = 0 ; i< str.length();i++)
    {
      char ch = str.charAt(i);
      if(ch >='a' && ch <= 'z')
      {
        int offset = ch -'a';
        offset = (offset - key)%26;
        if(offset < 0)
        {
        ch = (char)(offset+'a'+26);
      
        }
        else
          ch = (char)(offset+'a');
          sb.setCharAt(i,ch);
      
      }
        else if(ch >= 'A' && ch <= 'Z')
        {
          int offset = ch - 'A';
            offset = (offset-key)%26;
            ch = (char)(offset +'A');
          sb.setCharAt(i,ch);
          
        }
          
    }
    System.out.println(sb);
  }
}