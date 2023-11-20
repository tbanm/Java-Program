package project_java;
import java.util.Scanner;

//declare of parent class of rectangle
class parentofrectangle{
	
	int length;
	int weidgth;
	
}
//crate child class of rectangle
class childClassrectangle1 extends parentofrectangle{
	int Area;
	int Circom;
	parentofrectangle Area1 = new parentofrectangle();
	Scanner sc= new Scanner(System.in);
	
	//display user input
	void display() {
		System.out.println("Enter the length:");
		Area1.length = sc.nextInt();
		System.out.println("Enter the width:");
		Area1.weidgth = sc.nextInt();
		System.out.println("Length" +Area1.length);
		System.out.println("Weidgth"+Area1.weidgth);
		
		
	}
	void area() {
		Area = Area1.length * Area1.weidgth;
		System.out.println("Area of reactangle is:"+ Area);
	}
	void circomfarence() {
		Circom = 2*(Area1.length+Area1.weidgth);
		System.out.println("The circomference of rectangle is:" +Circom);
	}

}

/*class childClassrectangle2 extends parentofrectangle{
	int Circom ;
	//parentofrectangle circom1 = new parentofrectangle();
	
	
	void circomfarence() {
		Circom = 2*(Area1.length+Area1.weidgth);
		System.out.println("The circomference of rectangle is:" +Circom);
	}
	
}*/




public class inheritance_areaofRec {

	public static void main(String[] args) {
		childClassrectangle1 child = new childClassrectangle1();
		child.display();
		child.area();
		//childClassrectangle2 child2 = new childClassrectangle2();
		//child2.display();
		
		child.circomfarence();
		

	}

}
