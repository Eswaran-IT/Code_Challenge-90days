package day_30;
import java.util.StringTokenizer;
public class Code3 {
public static void main(String[] args) {
	        String inputString = "apple,banana,orange,grape";
	        String delimiter = ",";

	        // Create a StringTokenizer object
	        StringTokenizer      tokenizer = new StringTokenizer(inputString, delimiter);

	        // Count and print the number of tokens
	        int numTokens = tokenizer.countTokens();
	        System.out.println("Number of tokens: " + numTokens);

	        // Iterate through and print each token
	        while (tokenizer.hasMoreTokens()) {
	            String token = tokenizer.nextToken();
	            System.out.println("Token: " + token);
	       

}}
}
