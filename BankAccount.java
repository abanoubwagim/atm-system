public class BankAccount {

private double balance;

public BankAccount(double amount)
{
    this.balance = amount;
}

    public double getBalance(){return this.balance;}

    public void withdraw(double amount)
    {
        if (this.balance >= amount && amount > 0)
        {
            this.balance -= amount;
        }
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            this.balance+= amount;
        }
    }

}
