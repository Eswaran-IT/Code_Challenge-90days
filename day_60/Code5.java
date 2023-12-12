package day_60;

	import java.util.Arrays;

public class Code5 {
	    public static void main(String[] args) {
	        int[] array = new int[5];
	        System.out.println("Original Array: " + Arrays.toString(array));
	        int fillValue = 10;
	        Arrays.fill(array, fillValue);
	        System.out.println("Filled Array: " + Arrays.toString(array));
	    }
	}

