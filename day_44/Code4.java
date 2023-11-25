package day_44;

import java.util.Arrays;

public class Code4 {
	    public static void rotateArray(int[] arr, int key) {
	        int n = arr.length;
	        key = key % n;
	        int[] result = new int[n];

	        for (int i = 0; i < n; i++) {
	            int newIndex = (i + key) % n;
	            result[newIndex] = arr[i];
	        }

	        System.arraycopy(result, 0, arr, 0, n);
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int key = 1;

	        System.out.println("Original Array: " + Arrays.toString(arr));

	        rotateArray(arr, key);

	        System.out.println("Rotated Array: " + Arrays.toString(arr));
	    
	}

}
