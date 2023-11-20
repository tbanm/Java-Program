package java_objects;

//CurrentAccount.java
//Class CurrentAccount

class CurrentAccount implements Account {
 private double balance;
 private double interestRate;
 

 public CurrentAccount(double initialDeposit, double Ir) {
     this.balance = initialDeposit;
     this.interestRate =Ir;
    		 
     
 }

 @Override
 public void deposit(double amount) {
     System.out.println( balance+= amount);
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         System.out.println(balance -= amount);
     }
 }

 @Override
 public void getBalance() {
     System.out.println( balance);
 }
 public void applyInterest() {
	 System.out.println(balance += balance * interestRate/100);
 }

}
