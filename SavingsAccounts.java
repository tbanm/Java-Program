package java_objects;

//SavingsAccount.java
//Class SavingsAccount

class SavingsAccount implements Account {
 private double balance;
 private double interestRate;

 public SavingsAccount(double initialDeposit, double interestRate) {
     this.balance = initialDeposit;
     this.interestRate = interestRate;
 }

 @Override
 public void deposit(double amount) {
    System.out.println( balance += amount);
 }

 @Override
 public void withdraw(double amount) {
	 System.out.println(balance -= amount);
 }

 @Override
 public void getBalance() {
	 System.out.println (balance);
 }

 // Applying interest rate 1.25% for 1 year: 
 public void applyInterest() {
	 System.out.println(balance += balance * interestRate/100);
 }
}

