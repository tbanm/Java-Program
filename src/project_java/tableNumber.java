package project_java;
import java.util.Scanner;

public class tableNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		//reading a number whose table is to be print  
		int num=sc.nextInt();
		int i =1;
		do {
			System.out.println(num+" * "+i+" = "+num*i);  
			i++;
			
		}while(i<=10);
		
		
		

	}

}
