package day_34;
import java.util.Arrays;
public class COde2 {
	    public static void main(String[] args) {
	        // Initialize a sample string
	        String originalString = "Hello, World!";

	        // split()
	        String[] splitArray = originalString.split(",");
	        System.out.println("Split Result: " + Arrays.toString(splitArray));

	        // compareTo()
	        String compareString = "Hello";
	        int compareToResult = originalString.compareTo(compareString);
	        System.out.println("Compare Result: " + compareToResult);

	        // length()
	        int stringLength = originalString.length();
	        System.out.println("String Length: " + stringLength);

	        // replace()
	        String replacedString = originalString.replace("Hello", "Hi");
	        System.out.println("Replaced String: " + replacedString);

	        // substring()
	        String subString = originalString.substring(7);
	        System.out.println("Substring: " + subString);

	        // equals()
	        boolean areStringsEqual = originalString.equals(compareString);
	        System.out.println("Are Strings Equal? " + areStringsEqual);

	        // contains()
	        boolean containsSubstring = originalString.contains("World");
	        System.out.println("Contains 'World'? " + containsSubstring);

	        // indexOf()
	        int indexOfSubstring = originalString.indexOf("World");
	        System.out.println("Index of 'World': " + indexOfSubstring);

	        // trim()
	        String stringWithSpaces = "   Trim Me   ";
	        String trimmedString = stringWithSpaces.trim();
	        System.out.println("Trimmed String: '" + trimmedString + "'");

	        // charAt()
	        char charAtIndex = originalString.charAt(7);
	        System.out.println("Character at Index 7: " + charAtIndex);

	        // toLowerCase()
	        String lowerCaseString = originalString.toLowerCase();
	        System.out.println("Lowercase String: " + lowerCaseString);

	        // concat()
	        String secondString = "Java!";
	        String concatenatedString = originalString.concat(" " + secondString);
	        System.out.println("Concatenated String: " + concatenatedString);

	        // valueOf()
	        int intValue = 42;
	        String stringValue = String.valueOf(intValue);
	        System.out.println("String Value of 42: " + stringValue);

	        // matches()
	        boolean matchesRegex = originalString.matches("[a-zA-Z,\\s]+");
	        System.out.println("Matches Regex? " + matchesRegex);

	        // startsWith()
	        boolean startsWithHello = originalString.startsWith("Hello");
	        System.out.println("Starts with 'Hello'? " + startsWithHello);

	        // endsWith()
	        boolean endsWithWorld = originalString.endsWith("World!");
	        System.out.println("Ends with 'World!'? " + endsWithWorld);

	        // isEmpty()
	        boolean isStringEmpty = originalString.isEmpty();
	        System.out.println("Is String Empty? " + isStringEmpty);

	        // intern()
	        String internedString = originalString.intern();
	        System.out.println("Interned String: " + internedString);

	        // getBytes()
	        byte[] byteArray = originalString.getBytes();
	        System.out.println("Bytes: " + Arrays.toString(byteArray));

	        // hashCode()
	        int hashCode = originalString.hashCode();
	        System.out.println("HashCode: " + hashCode);

	        // join()
	        String[] stringArray = {"Hello", "World"};
	        String joinedString = String.join(", ", stringArray);
	        System.out.println("Joined String: " + joinedString);

	        // replaceFirst()
	        String replacedFirst = originalString.replaceFirst("o", "!");
	        System.out.println("Replace First 'o': " + replacedFirst);

	        // subSequence()
	        CharSequence charSequence = originalString.subSequence(0, 5);
	        System.out.println("Subsequence: " + charSequence);

	        // toCharArray()
	        char[] charArray = originalString.toCharArray();
	        System.out.println("Char Array: " + Arrays.toString(charArray));

	        // format()
	        String formattedString = String.format("Welcome, %s!", "User");
	        System.out.println("Formatted String: " + formattedString);
	    }
	
}
