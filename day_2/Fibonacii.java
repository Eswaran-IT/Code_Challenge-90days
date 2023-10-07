package day_2;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		int first=0,last,second=1;
		Scanner getScanner=new Scanner(System.in);
		System.out.println("Fibonacii Series");
		System.out.println("Enter a number");
		last=getScanner.nextInt();
		/*
		 * set first o last 1
		 * add both and save to new var
		 * set first as last
		 * s
		 * set last as next 
		 */
        for (int i = 0; i <last; i++) {
			System.out.println(first);
			  int next = first + second;
	            first = next;
	            second= next;
	            System.out.println(next);
		}
		
		getScanner.close();
	}

}
