package day_47;
import java.util.HashSet;
import java.util.Set;

public class Code1 {
    public static void main(String[] args) {
        System.out.println("Rever Vowels");
      System.out.println(reverseVowels("hello"));
    }

 static public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < end && !vowels.contains(chars[start])) {
                start++;
            }

            while (start < end && !vowels.contains(chars[end])) {
                end--;
            }

            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
    }
}
