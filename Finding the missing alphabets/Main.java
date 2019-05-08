import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int freq[] = new int[26]; 
        for(int idx = 0; idx < str_len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
                int offset = sb.charAt(idx) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(idx, ch);
            }
        }
      for(int i = 0; i<str_len;i++ )
      {
        if(sb.charAt(i) >='a' && sb.charAt(i) <= 'z')
        {
          int offset = sb.charAt(i)-'a';
          freq[offset]++;
        }
      }
   //   System.out.print(sb);
      for(int i = 0 ; i < 26;i++)
      {
        if(freq[i] == 0)
        {
         // int offset = sb.charAt(i) - 'a';
          char ch = (char)(i +'a');
           System.out.print(ch+" ");
        }
       
      }
    }
}