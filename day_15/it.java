package day_15;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

public class it {
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        // Don't: Avoid modifying the list while using Iterator.
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	
}
