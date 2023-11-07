package day_30;

public class Code4 {
	    public static void main(String[] args) {
	        String str = "   Hello, World!   ";

	        // length()
	        int length = str.length();
	        System.out.println("Length of the string: " + length);

	        // charAt(int index)
	        char character = str.charAt(7);
	        System.out.println("Character at index 7: " + character);

	        // substring(int beginIndex)
	        String sub1 = str.substring(4);
	        System.out.println("Substring from index 4: " + sub1);

	        // substring(int beginIndex, int endIndex)
	        String sub2 = str.substring(7, 12);
	        System.out.println("Substring from index 7 to 12: " + sub2);

	        // startsWith(String prefix)
	        boolean startsWith = str.startsWith("Hello");
	        System.out.println("Starts with 'Hello': " + startsWith);

	        // endsWith(String suffix)
	        boolean endsWith = str.endsWith("World");
	        System.out.println("Ends with 'World': " + endsWith);

	        // contains(CharSequence sequence)
	        boolean contains = str.contains("Java");
	        System.out.println("Contains 'Java': " + contains);

	        // isEmpty()
	        boolean empty = str.isEmpty();
	        System.out.println("Is the string empty? " + empty);

	        // toLowerCase()
	        String lowercase = str.toLowerCase();
	        System.out.println("Lowercase: " + lowercase);

	        // toUpperCase()
	        String uppercase = str.toUpperCase();
	        System.out.println("Uppercase: " + uppercase);

	        // trim()
	        String trimmed = str.trim();
	        System.out.println("Trimmed: '" + trimmed + "'");
	    }


}
