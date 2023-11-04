package day_27;

public class Code1 {
    public static void main(String[] args) {
        System.out.println("Pattern searching");
        char a[] = {'1', '2', '3', '4', '5', '6', '1', '2', '3', '4'};
        char b[] = {'1', '2', '3', '4'};
        int m = a.length;
        int n = b.length;

        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (a[i + j] != b[j]) {
                    break;
                }
            }
            if (j == n) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}
