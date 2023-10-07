package day_2;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("String Reverse Code");
		 String wordString;
		System.out.println("Enter Words");
		Scanner getScanner=new Scanner(System.in);
	    wordString=getScanner.nextLine();
	    String str[]=wordString.split(" ");
	    System.out.println(str.length);
	    for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
	    wordString=Arrays.toString(str);
	    System.out.println("Reverse:"+wordString);
	    getScanner.close();
	    
	}

}
