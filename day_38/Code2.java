package day_38;

public class Code2 {
	    public static void main(String[] args) {
	        String str = "Hello, World! Hello, Java!";

	        String targetSubstring = "Java";  // Substring to find

	        int firstOccurrenceIndex = findFirstOccurrence(str, targetSubstring);

	        if (firstOccurrenceIndex != -1) {
	            System.out.println("First occurrence of \"" + targetSubstring + "\" starts at index: " + firstOccurrenceIndex);
	        } else {
	            System.out.println("\"" + targetSubstring + "\" not found in the string.");
	        }
	    }

	    private static int findFirstOccurrence(String str, String targetSubstring) {
	        return str.indexOf(targetSubstring);  // Returns the index of the first occurrence, or -1 if not found
	    
	}}
