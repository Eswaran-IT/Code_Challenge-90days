package day_36;
import java.util.regex.*;
public class Code5 {
public static void main(String[] args) {
	System.out.println("Regex");
	String mailString="useraccount@gmail.com";
	String mobilenumber="1234567890";
	 Pattern pattern=Pattern.compile("[a-z]");
	 if (mailString.charAt(0)=='0') {
		System.out.println("Not a valid mail");
	}
	 else {
	 Matcher matcher=pattern.matcher(mailString);
	 while (matcher.find()) {
		 System.out.print(matcher.group());
	 }}
	 System.out.println();
	 Pattern pattern1=Pattern.compile("[0-9]");
	 if (!(mobilenumber.length()==10)) {
		System.out.println("Not a valid number");
	}
	 else {
	 Matcher matcher=pattern1.matcher(mobilenumber);
	 while (matcher.find()) {
		 System.out.print(matcher.group());
	 }}
}
}
