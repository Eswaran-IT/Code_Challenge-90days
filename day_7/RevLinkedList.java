package day_7;

import java.util.LinkedList;
import java.util.Scanner;

public class RevLinkedList {
public static void main(String[] args) {
	int n=0,data=0;
	System.out.println("Reverse the linked list");
	LinkedList<Integer> actorIntegers=new LinkedList<Integer>();
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Enter no of data");
	n=getScanner.nextInt();
	for (int i = 0; i <n; i++) {
		System.out.println("Enter data element"+(i+1));
		data=getScanner.nextInt();
		actorIntegers.add(data);
	}
	System.out.println(actorIntegers);
	System.out.println("Reversed data");
	for (int i = actorIntegers.size()-1; i >=0; i--) {
		System.out.println(actorIntegers.get(i));
	}



   getScanner.close();
}
}
