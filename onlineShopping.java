import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;
class product
{
    String name;
    int price ;
    String category;
    int pid;
    public product(String Name , int price , String category, int pid)
    {
        this.name = Name;
        this.price = price;
        this.category = category;
        this.pid = pid ;
    }
}
public class onlineShopping {
    Vector <product> inventory ;
    public  onlineShopping()
    {
        inventory = new Vector<>();
    }
    public void addProduct(String name, int price , String category,int pid)
    {
        product Product = new product(name, price ,category, pid);
        inventory.add(Product);
    }
    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            product details = inventory.get(i);
            if (details.name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;  // Exit the loop once the product is found and removed
            }
        }
    }
    public void display()
    {
        for (product details : inventory)
        {
            System.out.println("name : " + details.name);
            System.out.println("Price : " + details.price);
            System.out.println("category "  + details.category);
        }
    }
    public static void main (String args [])
    {
        Scanner s = new Scanner(System.in);
        onlineShopping m = new onlineShopping();
        m.addProduct("Rice", 54, "Grocessory", 0);
        m.addProduct("Wheat", 67, "Grocessory",1);
        m.addProduct("Kitkat", 10, "chocolate", 2);
        m.display();
        m.removeProduct("Rice");
        m.display();
    }
    
}
