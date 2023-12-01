package day_46;

	import java.util.Scanner;

public class Code4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the starting ASCII value:");
	        int startAscii = scanner.nextInt();

	        System.out.println("Enter the number of characters to print:");
	        int numberOfChars = scanner.nextInt();

	        System.out.println("Characters:");

	        for (int i = 0; i < numberOfChars; i++) {
	            char correspondingChar = (char) (startAscii + i);
	            System.out.print(correspondingChar + " ");
	        }

	        scanner.close();
	    
	}

}
