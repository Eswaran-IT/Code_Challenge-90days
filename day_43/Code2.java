package day_43;
	import java.util.HashSet;


public class Code2 {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Apple"); // Duplicate not  added
	        System.out.println("HashSet: " + set);
	        if (set.contains("Banana")) {
	            System.out.println("Banana is in the HashSet");
	        }
	        set.remove("Orange");
	        System.out.println("Updated HashSet: " + set);
	    
	}

}
