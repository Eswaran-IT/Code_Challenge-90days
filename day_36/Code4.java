package day_36;
import java.util.regex.*;
public class Code4 {
public static void main(String[] args) {
	System.out.println("Predefined methods");
	String wordString="Hell Hellnice Hell Hell";
	int count=0;
	/*
	 *\\s \\S->space 
	 *\\d \\D->digits
	 *\\w \\W->special chars
	 *\\b ->boundaries
	 *.->all
	 *\\G->Groupbysame or Combined
	 **/
	String bString="\\s";
	Pattern pattern=Pattern.compile(bString);
	Matcher matcher=pattern.matcher(wordString);
	while (matcher.find()) {
		count+=1;
		System.out.print(matcher.group()+matcher.start());
		
	}
	System.out.println();
	System.out.println(count);
	
	
}
}
