package day_17;

public class code3 {
	    public static void main(String[] args) {
	        String paragraph = "Hello bro.how are you.";
	        String[] sentences = paragraph.split("\\.");
	        StringBuilder result = new StringBuilder();
	        for (String sentence : sentences) {
	            sentence = sentence.trim(); 
	            if (!sentence.isEmpty()) {
	                result.append(sentence.substring(0, 1).toUpperCase()).append(sentence.substring(1));
	                result.append(". "); 
	            }
	        }

	        System.out.println(result.toString().trim()); }
	}



