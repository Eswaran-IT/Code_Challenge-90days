package day_27;

	import java.util.Scanner;


public class Code4 {
	public static int[] rotateRight(int[] arr, int k) {
	        int n = arr.length;
	        int[] rotatedArray = new int[n];

	        for (int i = 0; i < n; i++) {
	            rotatedArray[(i + k) % n] = arr[i];
	        }

	        return rotatedArray;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] originalArray = new int[n];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < n; i++) {
	            originalArray[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the number of positions to rotate to the right: ");
	        int rotationSteps = scanner.nextInt();

	        int[] rotatedArray = rotateRight(originalArray, rotationSteps);

	        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
	        System.out.println("Rotated Array: " + java.util.Arrays.toString(rotatedArray));

	        scanner.close();
	    }
	}
