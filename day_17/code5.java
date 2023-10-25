package day_17;

	import java.util.HashSet;
	import java.util.Arrays;

public class code5 {
	    public static void main(String[] args) {
	        String[] stringArray = {"apple", "banana", "cherry", "apple", "date", "banana"};

	        String[] uniqueArray = removeDuplicates(stringArray);

	        System.out.println("Array with duplicates: " + Arrays.toString(stringArray));
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
	    }

	    public static String[] removeDuplicates(String[] arr) {
	        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
	        String[] uniqueArray = new String[set.size()];
	        set.toArray(uniqueArray);

	        return uniqueArray;
	    }
	

}
