package day_16;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.ListIterator;

public class Code2 {
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("A");
	        list.add("B");
	        list.add("C");

	        ListIterator<String> listIterator = list.listIterator();

	        while (listIterator.hasNext()) {
	            String element = listIterator.next();
	            System.out.println(element);
	        }

	        // Bidirectional iteration
	        while (listIterator.hasPrevious()) {
	            String element = listIterator.previous();
	            System.out.println(element);
	        }

	        // Modify elements while iterating
	        while (listIterator.hasNext()) {
	            String element = listIterator.next();
	            if (element.equals("B")) {
	                listIterator.set("New Value");
	            }
	        }
	    }
	

}
