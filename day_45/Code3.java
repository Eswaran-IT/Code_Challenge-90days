package day_45;

import java.util.Arrays;

public class Code3 {
    public static void main(String[] args) {
        System.out.println("Insertion Sorting");
        int[] a = new int[]{5, 4, 3, 2, 1, 0};
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            System.out.println("Iteration ->" + i + " " + Arrays.toString(a));
        }
       System.out.println("Final Array:"+Arrays.toString(a));
    }
    
}
