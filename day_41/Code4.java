package day_41;

public class Code4 {
    public static class Solution {
        public boolean isPalindrome(String s) {
            String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

            // Check if the cleaned string is a palindrome
            int left = 0;
            int right = cleanedString.length() - 1;

            while (left < right) {
                if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example Usage
        String input = "A man, a plan, a canal, Panama";
        boolean result = solution.isPalindrome(input);

        System.out.println("Is Palindrome: " + result);
    }
}
