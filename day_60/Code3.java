package day_60;

import java.util.Arrays;

public class Code3 {
    public static void main(String[] args) {
        // Source Array
        int[] srcArray = {10, 20, 30, 40, 50};

        // Destination Array
        int[] destArray = {0, 0, 0, 0, 0};

        // Print the original arrays
        System.out.println("Original Source Array: " + Arrays.toString(srcArray));
        System.out.println("Original Destination Array: " + Arrays.toString(destArray));

        // Manually copy elements from srcArray to destArray
        int srcPos = 1;      // Starting index in srcArray
        int destPos = 1;     // Starting index in destArray
        int length = 3;      // Number of elements to copy

        System.arraycopy(srcArray, srcPos, destArray, destPos, length);

        // Print the updated destination array
        System.out.println("Updated Destination Array: " + Arrays.toString(destArray));
    }
}
