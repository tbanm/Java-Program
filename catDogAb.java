package java_objects;
abstract class Animals{
	abstract void cats();
	abstract void dogs();
	
}
class Cats extends Animals{
	void cats() {
		System.out.println("Cats MEOW");
	}
	void dogs() {
		
	}
}
class Dogs extends Animals{
	void cats() {
	
	}
	void dogs() {
		System.out.println("Dogs bark");
	}
}


public class catDogAb {

	public static void main(String[] args) {
		Cats c = new Cats();
		c.cats();
		Dogs d = new Dogs();
		d.dogs();

	}

}
