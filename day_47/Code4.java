package day_47;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;

public class Code4 {
	    public static void main(String[] args) {
	        Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("one", 1);
	        hashMap.put("two", 2);
	        hashMap.put("three", 3);

	        // Using keySet() and enhanced for loop
	        System.out.println("Using keySet() and enhanced for loop:");
	        for (String key : hashMap.keySet()) {
	            Integer value = hashMap.get(key);
	            System.out.println("Key: " + key + ", Value: " + value);
	        }

	        // Using entrySet() and enhanced for loop
	        System.out.println("\nUsing entrySet() and enhanced for loop:");
	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }

	        // Using values() and enhanced for loop
	        System.out.println("\nUsing values() and enhanced for loop (only values):");
	        for (Integer value : hashMap.values()) {
	            System.out.println("Value: " + value);
	        }

	        // Using Java 8+ Streams
	        System.out.println("\nUsing Java 8+ Streams:");
	        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

	        // Using Iterator over keys
	        System.out.println("\nUsing Iterator over keys:");
	        Iterator<String> keyIterator = hashMap.keySet().iterator();
	        while (keyIterator.hasNext()) {
	            String key = keyIterator.next();
	            Integer value = hashMap.get(key);
	            System.out.println("Key: " + key + ", Value: " + value);
	        }

	        // Using Iterator over entries
	        System.out.println("\nUsing Iterator over entries:");
	        Iterator<Map.Entry<String, Integer>> entryIterator = hashMap.entrySet().iterator();
	        while (entryIterator.hasNext()) {
	            Map.Entry<String, Integer> entry = entryIterator.next();
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }
	    }
	}
