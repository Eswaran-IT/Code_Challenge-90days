package day_41;



	abstract class Shape {
	    // Abstract method (to be implemented by subclasses)
	    public abstract double calculateArea();

	    // Non-abstract method
	    public void printDescription() {
	        System.out.println("This is a shape.");
	    }
	}

	// Concrete subclass Circle
	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Additional methods specific to Circle, if needed
	}

	// Concrete subclass Rectangle
	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double calculateArea() {
	        return length * width;
	    }

	    // Additional methods specific to Rectangle, if needed
	}

	public class Code5 {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5.0);
	        Rectangle rectangle = new Rectangle(4.0, 6.0);

	        // Using abstract method
	        System.out.println("Area of Circle: " + circle.calculateArea());
	        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

	        // Using non-abstract method
	        circle.printDescription();
	        rectangle.printDescription();
	    }
	}

