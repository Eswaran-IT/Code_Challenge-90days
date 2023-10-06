package day_1;

import java.util.Scanner;

public class Fizzbuzz {
   public static void main(String[] args) {
	   int n;
	Scanner getScanner=new Scanner(System.in); 
	System.out.println("FizzBuzz");
	System.out.println("Enter the last number of series");
	n=getScanner.nextInt();
	for (int i = 1; i <=n; i++) {
    if (i%3==0 && i%5==0) {
			System.out.println(i+"->Fizzbuzz");
		}
	else if(i%3==0) {
		 System.out.println(i+"->Fizz");
		 
	 }
	 else if(i%5==0) {
		 System.out.println(i+"->Buzz");
		
	 }
	 else {
		System.out.println(i+"->Oops!,Not a FizzBuzz");
	}
	}
     getScanner.close();
}
}
