package day_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Intersection {

	    public static void main(String[] args) {
	        List<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);
	        list1.add(4);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(3);
	        list2.add(4);

	        List<Integer> intersection = new ArrayList<>();


	        for (int item1 : list1) {
	            for (int item2 : list2) {
	                if (item1 == item2) {
	                    intersection.add(item1);
	                    break; 
	                }
	            }
	        }

	        System.out.println("Intersection of list1 and list2: " + intersection);
	    }
	

	
}


