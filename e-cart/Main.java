//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return price;
  }
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
   public void setProduct(String product)
   {
    this.product=product;
   }
  public String getProduct()
  {
    return product;
  }
  public void setQuantity(int quantity){
    this.quantity=quantity;
  }
  public int getQuantity(){
    return quantity;
  }
  //create various method to return attribute value(s)
}

class Bill
{
 public void cal(int price, int quantity)
 {
   System.out.println("Total Price is : "+(price*quantity));
 }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String product = input.nextLine();
    int quantity = input.nextInt();
    int price = input.nextInt();
    
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
    c.setQuantity(quantity);
   // System.out.println(c.getProduct());
    // System.out.println(c.getQuantity());
    Bill obj = new Bill();
    obj.cal(price,quantity);
    //write the logic here
  }
}