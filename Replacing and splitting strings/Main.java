import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner input = new Scanner(System.in);
      String str1 = input.nextLine();
      String str2 = input.nextLine();
      int no =input.nextInt();
      String str3 = str2.replace(str1,str2);
      String s[] = str2.split(" ",no);
      for(String res:s)
      System.out.println(res);
    }
}