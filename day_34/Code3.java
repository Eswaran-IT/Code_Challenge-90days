package day_34;

	import java.util.Arrays;
	import java.util.List;

public class Code3 {
	    public static void main(String[] args) {
	        // Declaration and Initialization
	        int[] originalArray = {5, 2, 8, 1, 7};

	        // clone
	        int[] clonedArray = originalArray.clone();
	        System.out.println("Cloned Array: " + Arrays.toString(clonedArray));

	        // copyOf
	        int[] copiedArray = Arrays.copyOf(originalArray, 3);
	        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

	        // copyOfRange
	        int[] partialCopiedArray = Arrays.copyOfRange(originalArray, 1, 4);
	        System.out.println("Partial Copied Array: " + Arrays.toString(partialCopiedArray));

	        // equals
	        boolean areArraysEqual = Arrays.equals(originalArray, clonedArray);
	        System.out.println("Are Arrays Equal? " + areArraysEqual);

	        // fill
	        Arrays.fill(originalArray, 0);
	        System.out.println("Filled Array: " + Arrays.toString(originalArray));

	        // hashCode
	        int hashCode = Arrays.hashCode(originalArray);
	        System.out.println("HashCode: " + hashCode);

	        // sort
	        Arrays.sort(originalArray);
	        System.out.println("Sorted Array: " + Arrays.toString(originalArray));
	        // binarySearch (requires a sorted array)
	        System.out.println("Sorted Array: " + Arrays.toString(originalArray));

	        int searchKey = 2;
	        int index = Arrays.binarySearch(originalArray, searchKey);
	        System.out.println("Index of " + searchKey + ": " + index);

	        // toString
	        String arrayString = Arrays.toString(originalArray);
	        System.out.println("Array as String: " + arrayString);

	        // asList
	        List<int[]> listFromArray = Arrays.asList(originalArray);  // Note: creates a List<int[]>, not List<Integer>
	        System.out.println("List from Array: " + listFromArray);
	    
	}

}
