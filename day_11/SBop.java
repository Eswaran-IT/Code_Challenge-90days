package day_11;

public class SBop {
public static void main(String[] args) {
	System.out.println("Builder and Buffer");
// not possible->	String  f1=new StringBuffer("Hi");
 String aString="One Day Will be";
 System.out.println(aString);
//not possible StringBuffer nBuffer=aString;
	StringBuilder sb = new StringBuilder("Hello");
	sb.reverse(); 
	System.out.println(sb);
	StringBuffer buffer = new StringBuffer("World");
	buffer.reverse();
	System.out.println(buffer);
	sb.append("Raja Rani");
	System.out.println(sb);
	//error
	//sb="Jin Jam";
//	System.out.println(s);
}
}
