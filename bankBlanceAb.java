package java_objects;
abstract class Bank{    
	abstract int getBlance();    
	}    
	class BankA extends Bank{    
	int getBlance(){
		return 100;
		}    
	}    
	class BankB extends Bank{    
	int getBlance(){
		return 150;
		}    
	}  
	class BankC extends Bank{    
		int getBlance(){
			return 200;
			}    
		}  
	    
	public class bankBlanceAb{    
	public static void main(String args[]){    
	Bank b;  
	b=new BankA();  
	System.out.println("Rate of Interest is: "+b.getBlance()+" %");    
	b=new BankB();  
	System.out.println("Rate of Interest is: "+b.getBlance()+" %"); 
	b=new BankC();  
	System.out.println("Rate of Interest is: "+b.getBlance()+" %"); 
	
	}
	}

