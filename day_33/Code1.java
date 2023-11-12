package day_33;

public class Code1 {
	    public static void sort012(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {0, 2, 1, 2, 0};
	        sort012(arr);

	        System.out.print("Sorted Array (Brute Force Algo): ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	


}
