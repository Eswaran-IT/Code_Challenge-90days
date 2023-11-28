package day_49;

public class Code5 {
	    public static void main(String[] args) {
	        String[] wordsArray = {"Hello", "world", "this", "is", "an", "example"};

	        int totalWords = countWords(wordsArray);

	        System.out.println("Total words in the array: " + totalWords);
	    }

	    public static int countWords(String[] words) {
	        int totalCount = 0;

	        for (String word : words) {
	            // Split each string into words based on spaces
	            String[] wordArray = word.split("\\s+");
	            
	            // Count the words in the current string
	            totalCount += wordArray.length;
	        }

	        return totalCount;
	    
	}

}
