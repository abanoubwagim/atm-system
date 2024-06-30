import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount ba = new BankAccount(1000); // Initial amount
        ATM atm = new ATM(ba);// Create a class called  --> atm

        System.out.println("Welcome to the ATM");
        while(true)
        {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();  // The user inputs the number of your choice.

            switch (choice)
            {
                case 1 :
                    System.out.println("Enter amount to withdraw :");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 2 :
                    System.out.println("Enter amount to deposit :");
                    atm.deposit(sc.nextDouble());
                    break;
                case 3 :
                    atm.checkBalance();
                    break;
                case 4 :
                    System.out.println("Thank you for using the ATM ");
                    sc.close();
                    return;  // close while loop
                default :
                    System.out.println("invalid option  \n Please try again");
                    break;
            }

        }
        }
    }