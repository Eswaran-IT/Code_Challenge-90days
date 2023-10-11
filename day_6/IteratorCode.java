package day_6;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorCode {
public static void main(String[] args) {
	
	        ArrayList<String> list = new ArrayList<>();
	        list.add("A");
	        list.add("B");
	        list.add("C");

	        Iterator<String> iterator = list.iterator();

	        while (iterator.hasNext()) {
	            String element = iterator.next();

	            if (element.equals("B")) {
	                iterator.remove(); // Remove "B" from the list
	            }

	            System.out.println(element);
	        }

	        System.out.println("List after removal: " + list);
	    }
	


}
