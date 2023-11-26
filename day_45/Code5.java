package day_45;

import java.util.Arrays;

public class Code5 {
    public static void main(String[] args) {
        System.out.println("Selection Sorting");
        int[] a = new int[]{5, 4, 3, 2, 1, 0};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

            System.out.println("Iteration -> " + (i + 1) + " " + Arrays.toString(a));
        }
    System.out.println("Final Array:"+Arrays.toString(a));
    }
}
