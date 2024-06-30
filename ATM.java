public class ATM {

    private BankAccount account;

    public ATM(BankAccount account)
    {
        this.account = account;
    }
     public void withdraw(double amount)
    {
        if (account.getBalance() >= amount && amount>0)
        {
            this.account.withdraw(amount);
            System.out.println("Withdrawal successful\n New balance : "+this.account.getBalance());
        } else
            System.out.println("Insufficient balance or invalid amount.");
    }

    public void deposit(double amount)
    {
        if (amount > 0 )
        {
            this.account.deposit(amount);
            System.out.println("Deposit successful\n New balance : "+this.account.getBalance());
        } else
            System.out.println("invalid amount.");
    }

    public void checkBalance()
    {
        System.out.println("Current balance : "+this.account.getBalance());
    }


}
