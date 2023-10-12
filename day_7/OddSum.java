package day_7;

import java.util.Scanner;

public class OddSum {
public static void main(String[] args) {
	System.out.println("Sum of Odd Numbers");
	Scanner getScanner=new Scanner(System.in);
	int n=0,sum=0,num=0;
	System.out.println("Enter the number");
	n=getScanner.nextInt();
	for (int i = 1; i < n+1; i++) {
	if (!(i%2==0)) {
		sum+=i;
		num++;
	}	
	
	}
	System.out.println("Sum of odd num=>"+sum+" has number of odd counts->"+num);
	
	getScanner.close();
}
}
