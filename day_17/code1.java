package day_17;
import java.util.Scanner;

public class code1 {
public static void main(String[] args) {
	System.out.println("Revised Code");
	String nameString=null;
	Scanner getScanner=new java.util.Scanner(System.in);
	System.out.println("Enter string ");
	nameString=getScanner.next();
	char a[]=new char[nameString.length()];
	for (int i = 0; i < a.length; i++) {
		a[i]=nameString.charAt(i);
	}
	char b[]=nameString.toCharArray();
	System.out.println("B data");
	for (char c : b) {
		System.out.println(c);
	}
	System.out.println("A data");
	for (char c : a) {
		System.out.println(c);
	}
	
	getScanner.close();
}
}
