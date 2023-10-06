package day_1;


import java.util.Scanner;

public class Reverse_string {
     public static void main(String[] args) {
		System.out.println("Reverse a String");
		System.out.println("Enter the String");
		Scanner getScanner=new Scanner(System.in);
		String nameString=getScanner.nextLine();
		nameString=nameString.trim().toLowerCase();
		System.out.println(nameString);
		int j=0;
		char[] arr=nameString.toCharArray();
		char[] arr1= new char[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
		System.out.println("Reversed string");
		nameString = new String(arr1);
		System.out.println(nameString);
		
		
		getScanner.close();
	}
     
}
