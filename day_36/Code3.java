package day_36;
import java.util.regex.*;
public class Code3 {
public static void main(String[] args) {
	 String text1 = "abbbc";
     Pattern pattern1 = Pattern.compile("ab*c");
     Matcher matcher1 = pattern1.matcher(text1);

     if (matcher1.matches()) {
         System.out.println("Example 1: Pattern matched");
     } else {
         System.out.println("Example 1: Pattern did not match");
     }

     // Example 2: + (One or More Quantifier)
     String text2 = "acd";
     Pattern pattern2 = Pattern.compile("ab+c");
     Matcher matcher2 = pattern2.matcher(text2);

     if (matcher2.matches()) {
         System.out.println("Example 2: Pattern matched");
     } else {
         System.out.println("Example 2: Pattern did not match");
     }

     // Example 3: ? (Zero or One Quantifier)
     String text3 = "abc ac";
     Pattern pattern3 = Pattern.compile("a?c");
     Matcher matcher3 = pattern3.matcher(text3);

     if (matcher3.matches()) {
         System.out.println("Example 3: Pattern matched");
     } else {
         System.out.println("Example 3: Pattern did not match");
     }
}
}
