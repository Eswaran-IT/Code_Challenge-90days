package day_3;

import java.util.Scanner;

public class OddEven {
 public static void main(String[] args) {
	System.out.println("Odd Even Finder");
	int num=0;
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Enter num");
	num=getScanner.nextInt();
	if (num<=0) {
		System.out.println("Enter a valid number(POSITIVE)");
	}
	else {
	if (num%2==0) {
		System.out.println(num+"is Even");
	} else {
		System.out.println(num+"is Odd");
	}
	}
	getScanner.close();
}
}
