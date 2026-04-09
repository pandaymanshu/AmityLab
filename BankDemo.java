import java.util.*;

// Interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Customer class
class Customer {
    String name;
    int customerId;

    void getCustomerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();
    }

    void displayCustomer() {
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Account class implementing Bank
class Account extends Customer implements Bank {
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {
        displayCustomer();
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.getCustomerDetails();
        acc.deposit(5000);
        acc.withdraw(2000);

        acc.displayAccount();
    }
}