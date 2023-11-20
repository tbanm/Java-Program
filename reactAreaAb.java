package java_objects;
import java.lang.Math;

	abstract class shape{
		public abstract void RectArea(int l,int b);
		public abstract void SqArea(int side);
		public abstract void CirArea(int radius);
	}
	
	class Ar extends shape{
		public void RectArea(int l,int b) {
			int area = l*b;
			System.out.println("The area of reactangle is:" + area);
		}
		public void SqArea(int side) {
			int area = side * side;
			System.out.println("The area of square is:" + area);
			
		}
		public  void CirArea(int radius) {
			double area = Math.PI*radius*radius;
			System.out.println("The area of circle is:" + area);
			
		}
	}
	public class reactAreaAb {

	public static void main(String[] args) {
		Ar a1 = new Ar();
		a1.RectArea(11,22);
		a1.SqArea(17);
		a1.CirArea(8);

	}

}
