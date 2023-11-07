package day_30;
import 	java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;



public class Code5 {
	static Scanner getScanner=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Using Regular Expressions(regex)");
	String userinput=null,findword=null;
	System.out.println("Enter the sentence");
	userinput=getScanner.nextLine();
	System.out.println("Enter the word to find");
	findword=getScanner.next();
	System.out.println("Sentence->"+userinput+" Pattern->"+findword);
	patternfinder(userinput, findword);
	
}


static void patternfinder(String a,String b) {	
  Pattern pattern=Pattern.compile(b);	
  Matcher matcher=pattern.matcher(a);
  while (matcher.find()) {
	  //print the full data founds like entire text 
	//used  for compare without these two classes->//System.out.println(matcher.matches());
	System.out.println(matcher.group()+"Start->"+matcher.start()+"Ends at->"+matcher.end());
	
}

  
}
}
