package day_45;

import java.util.Arrays;

public class Code4 {
    public static void main(String[] args) {
        System.out.println("Bubble Sorting");
        int[] a = new int[]{5, 4, 3, 2, 1, 0};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("Iteration -> " + (i + 1) + " " + Arrays.toString(a));
        }
        System.out.println("Final array:   "+Arrays.toString(a));
    }
}
