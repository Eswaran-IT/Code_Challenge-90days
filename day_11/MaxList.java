package day_11;

import java.util.LinkedList;
import java.util.List;

public class MaxList {
public static void main(String[] args) {
	System.out.println("Max Element in List");
	List<Integer> l1=new LinkedList<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(400);
	l1.add(500);
	l1.add(100);
	l1.add(100);
	l1.add(200);
	l1.add(80);
	l1.add(400);
	l1.add(500);
	l1.add(600);
	 int max = Integer.MIN_VALUE; 
	 int min = Integer.MAX_VALUE;
	System.out.println(min);
	System.out.println(max);
	for (int num : l1) {
        if (num > max) {
            max = num; 
        }
        if (num < min) {
            min = num; 
        }
    }

    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);
}
}
