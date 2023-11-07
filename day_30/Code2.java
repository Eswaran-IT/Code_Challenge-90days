package day_30;
import java.util.Arrays;
import java.util.List;
public class Code2 {
    public static void main(String[] args) {
	        int[] originalArray = {5, 2, 8, 1, 9};
	        
	        // length
	        int length = originalArray.length;
	        System.out.println("Array length: " + length);

	        // clone
	        int[] clonedArray = originalArray.clone();
	        System.out.println("Cloned Array: " + Arrays.toString(clonedArray));

	        // copyOf
	        int[] copiedArray = Arrays.copyOf(originalArray, 3);
	        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

	        // copyOfRange
	        int[] rangeArray = Arrays.copyOfRange(originalArray, 1, 4);
	        System.out.println("Range Array: " + Arrays.toString(rangeArray));

	        // sort
	        Arrays.sort(originalArray);
	        System.out.println("Sorted Array: " + Arrays.toString(originalArray));

	        // binarySearch
	        int searchValue = 8;
	        int index = Arrays.binarySearch(originalArray, searchValue);
	        System.out.println("Index of " + searchValue + " is " + index);

	        // toString
	        String arrayString = Arrays.toString(originalArray);
	        System.out.println("Array as a string: " + arrayString);

	        // fill
	        int[] filledArray = new int[5];
	        Arrays.fill(filledArray, 42);
	        System.out.println("Filled Array: " + Arrays.toString(filledArray));

	        // asList
	        List<int[]> listFromArray = Arrays.asList(originalArray);
	        System.out.println("List from Array: " + listFromArray);

	        // equals
	        int[] compareArray = {2, 1, 8, 5, 9};
	        boolean isEqual = Arrays.equals(originalArray, compareArray);
	        System.out.println("Arrays are equal: " + isEqual);
	    }
	}


