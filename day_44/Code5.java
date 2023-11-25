package day_44;

public class Code5 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println(result);
        return result.toString().trim();
    }

    public static void main(String[] args) {
      
        Code5 solution = new Code5();
        String input = "Hello World Java";

        String reversedWords = solution.reverseWords(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + reversedWords);
    }
}
