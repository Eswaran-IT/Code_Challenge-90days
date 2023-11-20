package day_38;

public class Code4 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPowerOfTwo(1));  
        System.out.println(solution.isPowerOfTwo(16));  
        System.out.println(solution.isPowerOfTwo(3));  
        System.out.println(solution.isPowerOfTwo(0));  
        System.out.println(solution.isPowerOfTwo(-16)); }
    static class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false;       }

            int i = 0, d = 1;

            while (i < n && d < n) {
                d *= 2;
                i++;
            }

            return n == d;
        }
    }
}
