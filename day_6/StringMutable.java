package day_6;

public class StringMutable {
	public class StringDemo {
	    public static void main(String[] args) {
	        // Using String (Immutable)
	        String str = "Hello, ";
	        str += "world!";
	        System.out.println("Using String: " + str);

	        // Using StringBuilder (Mutable)
	        StringBuilder stringBuilder = new StringBuilder();
	        stringBuilder.append("Hello, ");
	        stringBuilder.append("world!");
	        String result1 = stringBuilder.toString();
	        System.out.println("Using StringBuilder: " + result1);

	        // Using StringBuffer (Mutable and Thread-Safe)
	        StringBuffer stringBuffer = new StringBuffer();
	        stringBuffer.append("Hello, ");
	        stringBuffer.append("world!");
	        String result2 = stringBuffer.toString();
	        System.out.println("Using StringBuffer: " + result2);

	        // Additional Methods
	        // Length of String
	        int lengthOfString = str.length();
	        System.out.println("Length of String: " + lengthOfString);

	        // Append Strings
	        String appendedString = str.concat(" How are you?");
	        System.out.println("Appended String: " + appendedString);

	        // Replace Characters
	        String replacedString = str.replace("Hello", "Hi");
	        System.out.println("Replaced String: " + replacedString);

	        // Uppercase and Lowercase
	        String uppercaseString = str.toUpperCase();
	        String lowercaseString = str.toLowerCase();
	        System.out.println("Uppercase: " + uppercaseString);
	        System.out.println("Lowercase: " + lowercaseString);

	        // Substring
	        String substring = str.substring(0, 5); // Get the first 5 characters
	        System.out.println("Substring: " + substring);
	    }
	}}
