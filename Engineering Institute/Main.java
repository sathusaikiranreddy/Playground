//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int base)
  {
     System.out.println("Base Salary: "+(base));
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary(int base)
  {
     System.out.println("CSE Faculty: "+(base+3000));
    //write your CSE class statements
  }
}
class IT
{
  public void salary(int base)
  {
     System.out.println("IT Faculty: "+(base+5000));
    //write your IT class statements
  }
}
class ECE
{
  public void salary(int base)
  {
  System.out.println("ECE Faculty: "+(base+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int base = input.nextInt();
    Faculty obj1 = new Faculty();
    obj1.salary(base);
    CSE obj2 = new CSE();
    obj2.salary(base);
       IT obj3 = new IT();
    obj3.salary(base);
      
    ECE obj = new ECE();
    obj.salary(base);
 
   
    
    //implement your required concept here
  }
}