package day_30;
import java.util.regex.*;
public class Code1 {
public static void main(String[] args) {
	System.out.println("Quantifiers  in Regex ");
	String text = "aaaabbcde12345fffgg";

	        // +: Matches one or more occurrences of 'a'
	        Pattern pattern1 = Pattern.compile("a+");
	        Matcher matcher1 = pattern1.matcher(text);

	        while (matcher1.find()) {
	            System.out.println("Match found: " + matcher1.group());
	        }

	        // *: Matches zero or more occurrences of 'b'
	        Pattern pattern2 = Pattern.compile("b*");
	        Matcher matcher2 = pattern2.matcher(text);

	        while (matcher2.find()) {
	            System.out.println("Match found: " + matcher2.group());
	        }

	        // ?: Matches zero or one occurrence of 'c'
	        Pattern pattern3 = Pattern.compile("c?");
	        Matcher matcher3 = pattern3.matcher(text);

	        while (matcher3.find()) {
	            System.out.println("Match found: " + matcher3.group());
	        }

	        // {n}: Matches exactly 'n' occurrences of 'd'
	        Pattern pattern4 = Pattern.compile("d{2}");
	        Matcher matcher4 = pattern4.matcher(text);

	        while (matcher4.find()) {
	            System.out.println("Match found: " + matcher4.group());
	        }

	        // {n,}: Matches 'n' or more occurrences of 'f'
	        Pattern pattern5 = Pattern.compile("f{2,}");
	        Matcher matcher5 = pattern5.matcher(text);

	        while (matcher5.find()) {
	            System.out.println("Match found: " + matcher5.group());
	        }

	        // {n,m}: Matches between 'n' and 'm' occurrences of 'g'
	        Pattern pattern6 = Pattern.compile("g{1,3}");
	        Matcher matcher6 = pattern6.matcher(text);

	        while (matcher6.find()) {
	            System.out.println("Match found: " + matcher6.group());
	        }
	    }
	


}
