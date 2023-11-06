package day_29;
import java.util.regex.*;
public class Code3 {
	    public static void main(String[] args) {
	        String text = "Hello said by the hello";
	        Pattern pattern=Pattern.compile("said");
	        Matcher matcher=pattern.matcher(text);
	        while (matcher.find()) {
				System.out.println(matcher.group()+" starts from "+matcher.start()+" and ends with "+matcher.end());
			}
	        
	        }
}
