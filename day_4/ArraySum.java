package day_4;

import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
	System.out.println("Sum of two elements in Array");
	int n=0,tar=0;
	Scanner get=new Scanner(System.in);
	System.out.println("Enter array size");
	n=get.nextInt();
	int a[]=new int[n];
	//input array
	for (int i = 0; i < n; i++) {
		System.out.println("Enter "+(i+1)+" element");
		a[i]=get.nextInt();
	}
	//display  array
	for (int c : a) {
		System.out.println(c);
	}
	System.out.println("Enter target element");
	tar=get.nextInt();
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]+a[j]==tar) {
				System.out.println(i);
				System.out.println(j);
			} 
		}
	}
	get.close();
}
}
