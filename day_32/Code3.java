package day_32;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;

public class Code3 {
	    public static void main(String[] args) {
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");

	        System.out.println("ArrayList:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        List<String> linkedList = new LinkedList<>();
	        linkedList.add("Orange");
	        linkedList.add("Grapes");
	        linkedList.add("Pineapple");

	        System.out.println("\nLinkedList:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }
	    }
	}
