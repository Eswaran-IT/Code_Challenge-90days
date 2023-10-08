package day_3;

import java.util.Scanner;

public class Exponentiation {
public static void main(String[] args) {
	System.out.println("Exponentiation code ");
	int base=0,power=0,result=1;
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Enter base value:");
	base=getScanner.nextInt();
	System.out.println("Enter power value:");
	power=getScanner.nextInt();
	for (int i = 1; i <=power; i++) {
		result*=base;
	}
	
	System.out.println("Exponentiation of base-> "+base+"and power-> "+power+"is->"+result);
	getScanner.close();
}
}
