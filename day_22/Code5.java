package day_22;

public class Code5 {
	    public static void main(String[] args) {
	        char symbol = '/'; 
	        if (Character.isLetterOrDigit(symbol)) {
	            System.out.println(symbol + " is a letter or digit.");
	        } else if (Character.isWhitespace(symbol)) {
	            System.out.println(symbol + " is whitespace.");
	        } else if (Character.isISOControl(symbol)) {
	            System.out.println(symbol + " is a control character.");
	        } else if (Character.isDigit(symbol)) {
	            System.out.println(symbol + " is a digit.");
	        } else if (Character.isLetter(symbol)) {
	            System.out.println(symbol + " is a letter.");
	        } else if (Character.isUpperCase(symbol)) {
	            System.out.println(symbol + " is an uppercase letter.");
	        } else if (Character.isLowerCase(symbol)) {
	            System.out.println(symbol + " is a lowercase letter.");
	        } else {
	            System.out.println(symbol + " is a symbol.");
	        
	    }
	}

}
