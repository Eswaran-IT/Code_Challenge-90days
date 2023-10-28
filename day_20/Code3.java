package day_20;

public class Code3 {
    public static void main(String[] args) {
        System.out.println("Pattern 3");
        int n = 6;
        char a = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (a + j) + " ");
            }
            System.out.println();
        }
    }
}
