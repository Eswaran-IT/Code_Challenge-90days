package  day_60;
import java.util.*;

public class Code2 {
    public static void main(String[] args) {
        System.out.println("Rotate array");
        int a[] = {1, 2, 3, 4, 5};
        Scanner getScanner = new Scanner(System.in);

        System.out.println("Enter input or Rotate key");
        int k = getScanner.nextInt();
        int n = a.length;

        int[] rotatedArray = new int[n];

        System.arraycopy(rotatedArray, 0, a, 0, n);

        System.out.println(Arrays.toString(a));
        System.out.println("Final");

        getScanner.close();
    }
}
