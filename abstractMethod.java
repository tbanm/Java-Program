package java_objects;
abstract class Parent{
	abstract void display();
	
}

class subclass1 extends Parent{
	void display() {
		System.out.println("This is the first subclass maessage.");
	}
}

class subclass2 extends Parent{
	void display() {
		System.out.println("This is the second subclass maessage.");
	}
}

public class abstractMethod {

	public static void main(String[] args) {
		Parent s1 = new subclass1();
		Parent s2 = new subclass2();
		s1.display();
		s2.display();
	

	}

}
