package java_objects;

//Main.java
//Class Main

public class Main {
 public static void main(String[] args) {
     //Bank bank = new Bank();
     SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
     savingsAccount.deposit(100);
     savingsAccount.withdraw(200);
     savingsAccount.getBalance();
     savingsAccount.applyInterest();
     CurrentAccount c1 = new CurrentAccount(145, 2.4);
     c1.deposit(100);
     c1.withdraw(200);
     c1.getBalance();
    c1.applyInterest();
     
     
 }
}

