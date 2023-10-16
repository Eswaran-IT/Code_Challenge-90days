package day_11;

public class Sop {
public static void main(String[] args) {
	System.out.println("String operations");
	String s1="Hello World,How are you";
	String s2="raja"+s1;
	System.out.println(s2);
	char r='r';
	char H='H';
	System.out.println("r"+(int)r+"H"+(int)H);
	System.out.println(s2.compareTo(s1));
	System.out.println(s2.contains(s2));
	System.out.println(s2.compareToIgnoreCase(s1));
	System.out.println(s1.contentEquals(s2));
	
	
	
	
}
}
