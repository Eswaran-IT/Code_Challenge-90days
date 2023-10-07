package day_2;

import java.util.Scanner;

public class Primenumber {
public static void main(String[] args) {
	int n;
	Boolean flag=false;
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Prime numbers");
	System.out.println("Enter the number:");
	n=getScanner.nextInt();
	for (int i = 2; i <=n/2; i++) {
		if (n %i==0) {
			flag=true;
			
		}
	}
	if (flag) {
		System.out.println("Not a  Prime");
		
	}
	else {
		System.out.println("Prime");
		
	}
	getScanner.close();
}
}
