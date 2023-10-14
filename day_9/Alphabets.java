package day_9;

public class Alphabets {
	    public static void main(String[] args) {
	        String text = "Eswaran";

	        int vowelCount = 0;
	        int consonantCount = 0;
	        text = text.toLowerCase();
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        System.out.println("Vowel Count: " + vowelCount);
	        System.out.println("Consonant Count: " + consonantCount);
	    }
	

}
