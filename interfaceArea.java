package java_objects;

  interface Shape1{
	double getArea();
}
 //class reactangle implements shape
 
  class Rectangle implements Shape1{
	 private double length;
	 private double width;
	 
	 public Rectangle(double length, double width) {
		 this.length = length;
		 this.width = width;
	 }
	 
	 public double getArea() {
		 return length * width;
	 }
	 
 }
 
 //class circle implements shape
 
  class Circle implements Shape1{
	 private double radius;
	 
	 
	 public Circle(double radius) {
		 this.radius = radius;
		 
	 }
	 
	 public double getArea() {
		 return 3.1416*radius*radius;
	 }
	 
 }
 
 // class Triangle implements shape
 
  class Triangle implements Shape1{
	 private double base;
	 private double height;
	 
	 public Triangle(double base, double height) {
		 this.base = base;
		 this.height = height;
	 }
	 
	 public double getArea() {
		 return 0.5*base*height;
	 }
	 
 }


public class interfaceArea {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 12);
		Circle cir = new Circle(3);
		Triangle tri = new Triangle(4, 6);
		System.out.println(rect.getArea());
		System.out.println(cir.getArea());
		System.out.println(tri.getArea());
		

	}

}
