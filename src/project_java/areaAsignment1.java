package project_java;
//Abstract Shape class
abstract class Shape {
 // Abstract method to calculate the area
 public abstract double calculateArea();
}

//Circle subclass
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementation of calculateArea method for Circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Rectangle subclass
class Rectangle extends Shape {
 private double width;
 private double height;

 // Constructor
 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // Implementation of calculateArea method for Rectangle
 @Override
 public double calculateArea() {
     return width * height;
 }
}

public class areaAsignment1{
 public static void main(String[] args) {
     // Create a Circle object
     Circle circle = new Circle(5.0);

     // Calculate and print the area of the circle
     double circleArea = circle.calculateArea();
     System.out.println("Circle Area: " + circleArea);

     // Create a Rectangle object
     Rectangle rectangle = new Rectangle(4.0, 6.0);

     // Calculate and print the area of the rectangle
     double rectangleArea = rectangle.calculateArea();
     System.out.println("Rectangle Area: " + rectangleArea);
 }
}


