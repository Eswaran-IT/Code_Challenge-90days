package day_29;

public class Code5 {
	    public static void main(String[] args) {
	        // Splitting a string using the String class
	        String text1 = "Hello World";
	        String[] words1 = text1.split(" ");
	        for (String word : words1) {
	            System.out.println("String class split: " + word);
	        }

	        // Splitting a string using the Pattern (regex) class
	        String text2 = "apple,orange;banana:grape";
	        String[] fruits = text2.split("[,;:]");
	        for (String fruit : fruits) {
	            System.out.println("Pattern class split: " + fruit);
	        
	    }
	}

}
