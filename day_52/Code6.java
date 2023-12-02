package day_52;

	import java.util.Scanner;

public class Code6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (isPerfectSquare(number)) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is not a perfect square.");
	        }
	        System.out.print("Enter a number: ");
	        int number1 = scanner.nextInt();
	        if (isPerfectCube(number1)) {
	            System.out.println(number1 + " is a perfect cube.");
	        } else {
	            System.out.println(number1 + " is not a perfect cube.");
	        }
	        scanner.close();
	    }
	    private static boolean isPerfectCube(int num) {
	        int cubeRoot = (int) Math.cbrt(num);
	        return cubeRoot * cubeRoot * cubeRoot == num;
	        }
	    private static boolean isPerfectSquare(int num) {
	        int sqrt = (int) Math.sqrt(num);
	        return sqrt * sqrt == num;
	    
	}

}
