import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      LinkedList ls = new LinkedList();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String str = input.readLine();
      String s = input.readLine();
      String st[] = str.split(",");
      for(int i = 0 ; i < st.length;i++)
      {
        ls.add(st[i]);
      }
      System.out.println(ls);
     System.out.println("Size of the linked list: "+ls.size());
      System.out.println("Is LinkedList empty? "+ls.isEmpty());
      System.out.println("Does LinkedList contains "+s+"? \n"+ls.contains(s));
      
      
    }
}