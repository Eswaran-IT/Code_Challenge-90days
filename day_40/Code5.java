package day_40;

public class Code5 {
	    public static void main(String[] args) {
	        String original = "Hello, World!";
	        String reversed = reverseString(original);

	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversed);
	    }

	    public static String reverseString(String input) {
	        if (input.length() <= 1) {
	            return input;
	        }
        return input.substring(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));
	    
	}

}
