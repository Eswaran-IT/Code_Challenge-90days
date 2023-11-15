package day_34;

public class Code1 {
	    public static void main(String[] args) {
	        // Original String
	        String originalString = "Hello, World! Hello, Universe!";

	        // replace()
	        String replacedString = originalString.replace("Hello", "Hi");
	        System.out.println("Original: " + originalString);
	        System.out.println("Replaced: " + replacedString);

	        // replaceFirst()
	        String replacedFirst = originalString.replaceFirst("Hello", "Hi");
	        System.out.println("Replace First: " + replacedFirst);

	        // replaceAll()
	        String replacedAll = originalString.replaceAll("Hello", "Hi");
	        System.out.println("Replace All: " + replacedAll);

	        // replace with regex
	        String replacedRegex = originalString.replaceAll("[aeiouAEIOU]", "*");
	        System.out.println("Replace Vowels: " + replacedRegex);

	        // replace characters
	        char[] charArray = originalString.toCharArray();
	        for (int i = 0; i < charArray.length; i++) {
	            if (charArray[i] == 'o') {
	                charArray[i] = '*';
	            }
	        }
	        String replacedChars = new String(charArray);
	        System.out.println("Replace 'o' with '*': " + replacedChars);
	    
	    }}

