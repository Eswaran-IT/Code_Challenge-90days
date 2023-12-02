package day_52;


	import java.util.Scanner;
	public class Code4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	   System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();
	        double cubeRoot = Math.cbrt(number);
	        System.out.println("Cube Root: " + cubeRoot);

	        scanner.close();
	    }
	}

