package day_53;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

public class Code4 {
	    public static void main(String[] args) {
	        String inputString = "The price is $25.9999 for product XYZ.";
	        String regexPattern = "\\$(\\d+\\.\\d{2})";
	        Pattern pattern = Pattern.compile(regexPattern);
	        Matcher matcher = pattern.matcher(inputString);
	        while (matcher.find()) {
	            String matchedPattern = matcher.group();
	            System.out.println("Matched pattern: " + matchedPattern);
	        }
	    }
	}
