package day_17;

public class code4 {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 2, 3, 4, 2, 5};
	        int target = 2;
	        
	        int count = countOccurrences(numbers, target);
	        
	        System.out.println("The element " + target + " appears " + count + " times in the array.");
	    }

	    public static int countOccurrences(int[] arr, int target) {
	        int count = 0;
	        for (int number : arr) {
	            if (number == target) {
	                count++;
	            }
	        }
	        return count;
	    }
	}


