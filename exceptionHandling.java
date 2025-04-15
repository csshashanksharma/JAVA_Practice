public class exceptionHandling extends Exception{
    public exceptionHandling (double amt)
    {
        super("Withdraw of amount :" + amt + "is not possible");
    }
}
class Account
{
    double minBalance = 500;
    double balance;
    public void deposit(double amt)
    {
        balance = balance + amt;
        System.out.println("Amount "+ amt + "deposited Successfully");
    }
    public void withdraw(double amt) throws exceptionHandling
    {
        if (balance - amt  <= minBalance)
        {
            throw new exceptionHandling(amt);
        }
        else{
            balance = balance - amt;

        }
    }
    public void getBalance ()
    {
        System.out.println("Balance Available = " + balance);
    }
    public static void main (String[] args)
    {

        try
        {
            Account a1 = new Account();
            a1.deposit(2000);
            a1.withdraw(1000);
            a1.getBalance();
            a1.withdraw(700);
        }
        catch (exceptionHandling e)
        {
            System.out.println("Error Message " + e);
        }
    }
}