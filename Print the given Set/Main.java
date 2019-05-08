import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet ls = new LinkedHashSet();
      String str = input.readLine();
      String arr[] = str.split(",");
      for(int i = 0 ; i < arr.length;i++)
      {
        ls.add(arr[i]);
      }
      System.out.print(ls);
    }
}