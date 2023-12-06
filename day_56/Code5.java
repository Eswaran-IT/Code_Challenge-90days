package day_56;


	import java.util.StringTokenizer;

public class Code5 {
	    public static void main(String[] args) {
	        String inputString = "Java is a programming language.";
	        StringTokenizer tokenizer = new StringTokenizer(inputString);
	        int tokenCount = tokenizer.countTokens();
	        System.out.println("Number of Tokens: " + tokenCount);
	        System.out.println("Tokens:");
	        while (tokenizer.hasMoreTokens()) {
	            String token = tokenizer.nextToken();
	            System.out.println(token);
	        }

	        String customInput = "apple,orange,banana,grape";
	        StringTokenizer customTokenizer = new StringTokenizer(customInput, ",");
	        System.out.println("\nTokens with Custom Delimiter (,):");
	        while (customTokenizer.hasMoreTokens()) {
	            String token = customTokenizer.nextToken();
	            System.out.println(token);
	        }
	        StringTokenizer enumerationTokenizer = new StringTokenizer("A B C");
	        System.out.println("\nUsing Enumeration Interface:");
	        while (enumerationTokenizer.hasMoreElements()) {
	            Object element = enumerationTokenizer.nextElement();
	            System.out.println(element);
	        }
	        StringTokenizer mixedDelimiterTokenizer = new StringTokenizer("apple,orange;banana", ",;");
	        System.out.println("\nTokens with Mixed Delimiters (, and ;):");
	        while (mixedDelimiterTokenizer.hasMoreTokens()) {
	            String token = mixedDelimiterTokenizer.nextToken();
	            System.out.println(token);
	        }
	    }
	}
