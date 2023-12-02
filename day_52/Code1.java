package day_52;
import java.util.regex.*;
public class Code1 {
public static void main(String[] args) {
	System.out.println("Regex");
	Pattern p=Pattern.compile(".$");
	Matcher m=p.matcher("valid word should be given here!@. ");
	while (m.find()) {
		System.out.println(m.group()+" Start:"+m.start());
	}
}
}
