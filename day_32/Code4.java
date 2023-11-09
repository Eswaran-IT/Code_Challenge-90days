package day_32;

	import java.util.Scanner;

public class Code4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        boolean isPalindrome = isPalindrome(input);
	        if (isPalindrome) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }
	    }

	       public static boolean isPalindrome(String str) {
	        str = str.replaceAll("\\s", "").toLowerCase();
	        return str.equals(new StringBuilder(str).reverse().toString());
	    }
	}

