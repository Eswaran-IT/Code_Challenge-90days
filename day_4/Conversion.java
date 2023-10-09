package day_4;

import java.util.Arrays;

public class Conversion {
  public static void main(String[] args) {
	System.out.println("Evaluate the coversion process");
	char c[]=new char[4];
	String wordString="Java Programming";
	String wordString2=wordString.concat(" Code");
	System.out.println(wordString2);
	wordString2=wordString2.repeat(2);
	System.out.println(wordString2);
	
	for (int i = 0; i < c.length; i++) {
		c[i]=wordString.charAt(i);
		
	}
	for (char g : c) {
		System.out.println(g);
	}
    String naString=Arrays.toString(c);
	System.out.println(naString);
	
	//string to primitive types
	String nameString="1000";
	int num=Integer.parseInt(nameString);
	System.out.println(num);
	
	//primitive to string
	float g=1.3f;
	String nameString2=Float.toString(g);
	String nameString3=String.valueOf(g);
	System.out.println(nameString3);
	System.out.println(nameString2);
	//value of for int float char and its array
	System.out.println(String.valueOf(g));
}
}
