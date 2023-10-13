package day_8;

import java.util.Scanner;

public class RotateArray {
public static void main(String[] args) {
	int n=0,key=0;
	System.out.println("Rotate the array by key value");
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Enter the arayy size");
	n=getScanner.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < n; i++) {
		System.out.println("Enter element:"+(i+1));
		int val=getScanner.nextInt();
		a[i]=val;
	}
	System.out.println("Enter steps to move:");
	key=getScanner.nextInt();
	int b[]=new int[n];
	  for (int i = 0; i < n; i++) {
          int newIndex = (i + key) % n; // Calculate the new index after rotation
          b[newIndex] = a[i];
      }
	
	for (int j : b) {

		System.out.println(j);
	}
	
	
	
getScanner.close();	
}
}
