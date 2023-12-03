package day_53;

class Code3 {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        int positionsToRotate = 2;
	        rotateArrayLeft(array, positionsToRotate);
	        for (int element : array) {
	            System.out.print(element + " ");
	        }
	    }

	    public static void rotateArrayLeft(int[] arr, int positions) {
	        int n = arr.length;
	        positions = positions % n; 
	        /*
	         * reversing array 
	         */
	        reverseArray(arr, 0, positions - 1);
	        reverseArray(arr, positions, n - 1);
	        reverseArray(arr, 0, n - 1);
	    }

	    public static void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}

