package day_28;


	import java.util.regex.Pattern;
	import java.util.regex.Matcher;
	public class Code5 {
		public static void main(String[] args) {
	        String text = "Hello, my email is example@email.com. Please contact me!";
	        String regex = "\\b\\w+@\\w+\\.\\w+\\b"; // A simple email regex pattern

	        // Create a Pattern object
	        Pattern pattern = Pattern.compile(regex);

	        // Create a Matcher object
	        Matcher matcher = pattern.matcher(text);

	        // Find all email addresses in the text
	        while (matcher.find()) {
	            System.out.println("Found: " + matcher.group());
	        }
	    
	

}
}
