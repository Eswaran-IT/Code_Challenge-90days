package day_42;
import 	java.util.* ;
public class Code2 {
public static void main(String[] args) {
	System.out.println("Vector");
	Vector<String> v=new Vector<>();
	System.out.println(v.capacity());
	v.add("Hello");
	v.add(0, null);
	System.out.println(v);
	System.out.println(v.size());
	        Vector<String> colors = new Vector<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        System.out.println("Element at index 1: " + colors.get(1));
	        colors.set(1, "Yellow");
	        System.out.println("Iterating using Enumeration:");
	        Enumeration<String> enumeration = colors.elements();
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }

	        // Iterating using enhanced for loop (Java 5+)
	        System.out.println("Iterating using Enhanced For Loop:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        colors.remove("Blue");
	        System.out.println("Contains 'Green': " + colors.contains("Green"));
	        System.out.println("Size of Vector: " + colors.size());
	        colors.clear();
	        System.out.println("Is Vector empty? " + colors.isEmpty());
	    
	

	
}
}
