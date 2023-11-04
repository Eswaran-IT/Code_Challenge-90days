package day_27;

	import java.util.HashSet;

public class Code2 {
	 public static boolean isPalindrome(String str) {
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        str = str.replaceAll("\\s", "").toLowerCase();

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // Not a palindrome
	            }
	            left++;
	            right--;
	        }

	        return true; // It's a palindrome
	    }

	    public static void main(String[] args) {
	        String testString = "racecar";
	        
	        if (isPalindrome(testString)) {
	            System.out.println("It's a palindrome!");
	        } else {
	            System.out.println("It's not a palindrome.");
	        }
	    }
	}

