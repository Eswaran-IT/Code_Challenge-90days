package day_7;

import java.util.Scanner;

public class Countsequence {
public static void main(String[] args) {
	int n=0;
	String numString=null;
	System.out.println("Count and Say ");
	Scanner getScanner=new Scanner(System.in);
	numString=getScanner.nextLine();
	n=numString.length();
	char a[]=numString.toCharArray();
	for (int i = 0; i < n; i++) {
		char temp=a[i];
		int count=1;
		for (int j =i+1 ; j < n; j++) {
			if (temp==a[j]) {
				count++;
			
		} else {
            break;}
		}
		 i += count - 1;
		System.out.println("Counts of "+temp+" is "+count);
			
		
		
		}
		
	
	
	
	getScanner.close();
}
}
