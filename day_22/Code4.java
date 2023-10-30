package day_22;

public class Code4 {
	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive counting.

	        int vowelCount = 0;
	        int consonantCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a letter (not a symbol or space).
	            if (Character.isLetter(ch)) {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        System.out.println("Vowel count: " + vowelCount);
	        System.out.println("Consonant count: " + consonantCount);
	    
	}

}
