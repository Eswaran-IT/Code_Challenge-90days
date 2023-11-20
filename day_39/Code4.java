package day_39;

public class Code4 {
	    public static boolean isPalindrome(String s) {
	        // Convert to lowercase and remove non-alphanumeric characters
	        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

	        // Check if the cleaned string is a palindrome
	        int left = 0;
	        int right = cleanedString.length() - 1;

	        while (left < right) {
	            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String s1 = "A man, a plan, a canal: Panama";
	        String s2 = "race a car";
	        String s3 = " ";

	        System.out.println("Is \"" + s1 + "\" a palindrome? " + isPalindrome(s1));
	        System.out.println("Is \"" + s2 + "\" a palindrome? " + isPalindrome(s2));
	        System.out.println("Is \"" + s3 + "\" a palindrome? " + isPalindrome(s3));
	    
	}

}
