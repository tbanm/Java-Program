package project_java;

//Abstract BankAccount class
abstract class BankAccount {
 private String accountNumber;
 protected double balance;

 // Constructor
 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Abstract method to deposit money
 public abstract void deposit(double amount);

 // Abstract method to withdraw money
 public abstract void withdraw(double amount);

 // Getter for account number
 public String getAccountNumber() {
     return accountNumber;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }
}

//CheckingAccount subclass
class CheckingAccount extends BankAccount {
 // Constructor
 public CheckingAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 // Implementation of deposit method for CheckingAccount
 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited $" + amount + " into account " + getAccountNumber());
     } else {
         System.out.println("Invalid deposit amount");
     }
 }

 // Implementation of withdraw method for CheckingAccount
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn $" + amount + " from account " + getAccountNumber());
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance");
     }
 }
}

public class bankAsignment2{
 public static void main(String[] args) {
     // Create a CheckingAccount object
     CheckingAccount checkingAccount = new CheckingAccount("123456789", 1000.0);

     // Deposit $500 into the account
     checkingAccount.deposit(500.0);

     // Withdraw $200 from the account
     checkingAccount.withdraw(200.0);

     // Print the updated balance
     System.out.println("Updated Balance: $" + checkingAccount.getBalance());
 }
}


