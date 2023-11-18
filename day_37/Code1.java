package day_37;
//Shape interface with a default method
interface Shape {
 // Abstract method for calculating area
 double calculateArea();

 // Default method for displaying the type of shape
 default void displayType() {
     System.out.println("This is a generic shape.");
 }
}

//Circle class implementing Shape
class Circle implements Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementation of abstract method for calculating area
 @Override
 public double calculateArea() {
     return Math.PI * Math.pow(radius, 2);
 }

 // Specific implementation for displaying the type of shape
 @Override
 public void displayType() {
     System.out.println("This is a circle.");
 }
}

//Rectangle class implementing Shape
class Rectangle implements Shape {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementation of abstract method for calculating area
 @Override
 public double calculateArea() {
     return length * width;
 }
}

public class Code1 {
 public static void main(String[] args) {
     // Using Circle
     Circle circle = new Circle(5.0);
     circle.displayType();           // Output: This is a circle.
     System.out.println("Area: " + circle.calculateArea());

     // Using Rectangle
     Rectangle rectangle = new Rectangle(4.0, 6.0);
     rectangle.displayType();        // Output: This is a generic shape.
     System.out.println("Area: " + rectangle.calculateArea());
 }
}

