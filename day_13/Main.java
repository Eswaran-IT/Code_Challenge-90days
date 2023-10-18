package day_13;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("Find word in given stirng");
	System.out.println("Enter Sentence:\n");
	Scanner get=new Scanner(System.in);
	String wordString[]=get.nextLine().toLowerCase().split(" ");
	System.out.println("Enter word to search");
	String key=get.nextLine();
	for (int i = 0; i < wordString.length; i++) {
		if (wordString[i].equals(key)) {
			System.out.println("Founed in given string:");
		}
		
	}
	
	



   get.close();
}
}
