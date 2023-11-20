package day_39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Code2 {
	    	    public static List<Integer> findSubstring(String s, String[] words) {
	    	        List<Integer> result = new ArrayList<>();

	    	        if (s == null || s.length() == 0 || words == null || words.length == 0) {
	    	            return result;
	    	        }

	    	        int wordLength = words[0].length();
	    	        int totalLength = wordLength * words.length;

	    	        Map<String, Integer> wordCount = new HashMap<>();

	    	        for (String word : words) {
	    	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	    	        }

	    	        for (int i = 0; i <= s.length() - totalLength; i++) {
	    	            String substring = s.substring(i, i + totalLength);
	    	            Map<String, Integer> currentMap = new HashMap<>();

	    	            for (int j = 0; j < totalLength; j += wordLength) {
	    	                String currentWord = substring.substring(j, j + wordLength);
	    	                currentMap.put(currentWord, currentMap.getOrDefault(currentWord, 0) + 1);
	    	            }

	    	            if (currentMap.equals(wordCount)) {
	    	                result.add(i);
	    	            }
	    	        }

	    	        return result;
	    	    }

	    	    public static void main(String[] args) {
	    	        // Example 1
	    	        String s1 = "barfoothefoobarman";
	    	        String[] words1 = {"foo", "bar"};
	    	        System.out.println(findSubstring(s1, words1)); // Output: [0, 9]

	    	        // Example 2
	    	        String s2 = "wordgoodgoodgoodbestword";
	    	        String[] words2 = {"word", "good", "best", "word"};
	    	        System.out.println(findSubstring(s2, words2)); // Output: []

	    	        // Example 3
	    	        String s3 = "barfoofoobarthefoobarman";
	    	        String[] words3 = {"bar", "foo", "the"};
	    	        System.out.println(findSubstring(s3, words3)); // Output: [6, 9, 12]
	    	    }
	    	}
