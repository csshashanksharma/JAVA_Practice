class exceptionBank extends Exception
{
    public exceptionBank(int amt)
    {
        super("Unable to withdraw " + amt + " Amount");
    }
}
public class banking
{
    int amt ;
    int balance;
    int minBalance = 500;
    public void deposit (int amt)
    {
        balance = balance + amt;
        System.out.println("amount Deposited successfully");
    }
    public void withdraw (int amt) throws exceptionBank
    {
        if (balance - amt < 500)
        {
            throw new exceptionBank(amt);
        }
        else
        {
            balance = balance - amt;
            System.out.println("Amount Withdrawn successfully");
        }
    }
    public static void main(String args[])
    {
        banking b = new banking();
        try
        {
            b.deposit(1000);
            b.withdraw(800);
        }
        catch (exceptionBank e)
        {
            System.out.println("Error Message :" + e.getMessage());
        }
    }
}
