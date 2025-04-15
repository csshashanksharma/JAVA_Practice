import java.util.ArrayList;
class supplies 
{
    int id;
    String name;
    int price;
    String Quantity;
    public supplies(int id , String name  ,int price , String Quantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Quantity = Quantity;
    }
}
public class pharmacyManagement {
    ArrayList <supplies> inventory ;
    public pharmacyManagement ()
    {
        inventory = new ArrayList<>();
    }
    public void addItem(int id ,String name, int price,String Quantity)
    {
        supplies s = new supplies(id, name, price, Quantity);
        inventory.add(s);
    }
    public void update(int id , String newName , int newprice , String newQuantity)
    {
        for (supplies details : inventory)
        {
            if (details.id == id )
            {
                details.name = newName;
                details.price = newprice;
                details.Quantity = newQuantity;
            }
        }
    }
    public void removeItem(int id)
    {
        for (supplies details : inventory)
        {
            if (details.id == id )
            {
                inventory.remove(details);
                break;
            }
        }
    }
    public void display()
    {
        for(supplies details : inventory)
        {
            System.out.println("name : " + details.name);
            System.out.println("Price " + details.price);
            System.out.println("Quantity : " + details.Quantity);
            System.out.println("ID :" + details.id);
        }
    }
    public static void main(String args[])
    {
        pharmacyManagement p = new pharmacyManagement();
        p.addItem(0, "dole", 20, "2 sheets");
        p.addItem(1, "oxolygen", 40, "2 sheets");
        p.addItem(2, "Z-pose", 200, "1 sheet");
        p.display();
        p.removeItem(0);
        System.out.println("Item removed After Removing");
        p.display();
        p.update(1, "glucomat", 234, "1 sheet");
        System.out.println("After Updting");
        p.display();

    }
}
