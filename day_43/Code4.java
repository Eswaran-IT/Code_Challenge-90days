package day_43;

public class Code4 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
 return result.toString().trim();
    }
    public static void main(String[] args) {
		System.err.println("REVERSE STRING");
		
	}
}
