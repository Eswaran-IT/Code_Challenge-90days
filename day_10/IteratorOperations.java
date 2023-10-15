package day_10;
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	import java.util.ListIterator;

public class IteratorOperations {
	
	public static void main(String[] args) {
		
		        // Create a list of strings
		        List<String> stringList = new ArrayList<>();
		        stringList.add("Apple");
		        stringList.add("Banana");
		        stringList.add("Cherry");

		        // Using Iterator to iterate through the list
		        System.out.println("Using Iterator:");
		        Iterator<String> iterator = stringList.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }

		        // Using ListIterator to reverse the elements in a string array
		        System.out.println("\nUsing ListIterator to reverse a string array:");
		        String[] stringArray = {"One", "Two", "Three", "Four", "Five"};
		        ListIterator<String> listIterator = stringList.listIterator();
		        while (listIterator.hasNext()) {
		            stringArray[listIterator.nextIndex()] = listIterator.next();
		        }
		        for (String str : stringArray) {
		            System.out.println(str);
		        }

		        // Using Enhanced for-each loop to iterate through the list
		        System.out.println("\nUsing Enhanced for-each loop:");
		        for (String str : stringList) {
		            System.out.println(str);
		        }
		    
		

	}
	}

