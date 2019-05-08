import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet ls = new LinkedHashSet();
      String str = input.readLine();
       String s = input.readLine();
      String ns = input.readLine();
      String arr[] = str.split(",");
       for(int i = 0 ; i < arr.length;i++)
      {
        ls.add(arr[i]);
      }
      System.out.println(ls);
      System.out.println("Enter the value to be deleted: "+s);
      ls.remove(s);
      System.out.println(ls);
      System.out.println("Enter the value to be added: "+ns);
      ls.add(ns);
        System.out.println(ls);
      
     
    }
}