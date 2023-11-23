package day_41;

public class Code3 {
    public static class Solution {
        public int lengthOfLastWord(String s) {
            String[] words = s.split(" ");

            // Check if there are words in the array
            if (words.length == 0) {
                return 0;
            }

            // Retrieve the last word from the array
            String lastWord = words[words.length - 1];

            // Return the length of the last word
            return lastWord.length();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example Usage
        String sentence = "Hello World";
        int length = solution.lengthOfLastWord(sentence);

        System.out.println("Length of the last word: " + length);
    }
}
