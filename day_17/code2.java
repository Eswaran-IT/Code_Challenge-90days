package day_17;
import java.util.Arrays;
import java.util.Scanner;

public class code2 {
public static void main(String[] args) {
	System.out.println("Array");
	Scanner getScanner=new java.util.Scanner(System.in);
	byte a[]=new byte[6];
	for (int i = 0; i < a.length; i++) {
		a[i]=(byte) (i+1);
		
	}
	System.out.println("Data");
	for (byte b : a) {
		System.out.println(b);
	}
	
	String wordString=Arrays.toString(a).indent(3);;
	System.out.println(wordString);
	
	
	
	getScanner.close();
}
}
