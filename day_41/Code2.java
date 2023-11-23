package day_41;
import java.util.Arrays;
public class Code2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            int h = (i + k) % n;
            r[h] = nums[i];
        }
        System.arraycopy(r, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        Code2 solution = new Code2();

        // Example Usage
        int[] array = {1, 2, 3, 4, 5};
        int steps = 2;

        System.out.println("Original Array: " + Arrays.toString(array));
        solution.rotate(array, steps);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}
