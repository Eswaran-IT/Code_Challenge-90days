package day_16;

	@FunctionalInterface
	interface SquareCalculator {
	    int calculateSquare(int number);
	}

public class Code4 {
	    public static void main(String[] args) {
	        // Create a lambda expression using the SquareCalculator functional interface
	        SquareCalculator calculator = (number) -> number * number;

	        // Use the lambda expression to calculate the square of a number
	        int result = calculator.calculateSquare(5);
	        System.out.println("The square of 5 is: " + result);
	    }
	

}
