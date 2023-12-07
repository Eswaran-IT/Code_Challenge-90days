package day_57;

public class Code3 {
	 static boolean isPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String word = "level";
	        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome(word));
	    }
}
