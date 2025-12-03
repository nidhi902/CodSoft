import java.util.Scanner;

// Class to represent the user's bank account
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return false;
        }
        balance -= amount;
        System.out.println("Please collect your cash.");
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

// Class to represent ATM machine
class ATM {
    private BankAccount account;
    private Scanner sc = new Scanner(System.in);

    ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n---- ATM MENU ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 4);
    }
}

// UPDATED MAIN CLASS NAME
public class task3_ATMinterface {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(5000); // initial balance
        ATM atm = new ATM(user);
        atm.start();
    }
}
