package day_16;


	import java.util.HashSet;
	import java.util.Set;

public class Code5 {
	    public static void main(String[] args) {
	        Set<String> uniqueNames = new HashSet<>();
	        uniqueNames.add("Alice");
	        uniqueNames.add("Bob");
	        uniqueNames.add("Charlie");
	        uniqueNames.add("Alice"); //  duplicate

	        // Check if an element is in the set
	        boolean containsAlice = uniqueNames.contains("Alice");
	        System.out.println(containsAlice);
	        boolean containsDavid = uniqueNames.contains("David");
	        System.out.println(containsDavid);
	        //size
	        int size = uniqueNames.size();
	        System.out.println(size);

	        // Remove 
	        uniqueNames.remove("Charlie");

	        // Iterate
	        for (String name : uniqueNames) {
	            System.out.println(name);
	        }

	     
	        uniqueNames.clear();
	    }
	}

