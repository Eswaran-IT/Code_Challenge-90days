package day_60;

	import java.util.Arrays;

public class Code4 {
	    public static void main(String[] args) {
	        int[] array1 = {5, 2, 8, 1, 7};
	        System.out.println("Original Array: " + Arrays.toString(array1));
	        int[] array2 = Arrays.copyOf(array1, array1.length);
	        System.out.println("Copied Array: " + Arrays.toString(array2));
	        Arrays.sort(array1);
	        System.out.println("Sorted Array: " + Arrays.toString(array1));
	        Arrays.fill(array2, 10);
	        System.out.println("Filled Array: " + Arrays.toString(array2));
	        int key = 8;
	        int index = Arrays.binarySearch(array1, key);
	        System.out.println("Index of " + key + ": " + index);
	        boolean isEqual = Arrays.equals(array1, array2);
	        System.out.println("Arrays are equal: " + isEqual);
	        String arrayString = Arrays.toString(array1);
	        System.out.println("String Representation: " + arrayString);
	    }
	}
