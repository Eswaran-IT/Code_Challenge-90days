package day_26;

import java.util.HashMap;
import java.util.Map;

public class Code5 {
	public static void main(String[] args) {
	        int[] array = {3, 4, 3, 6, 4, 5, 6, 7, 3, 8, 9, 9, 9};

	        Map<Integer, Integer> elementCountMap = new HashMap<>();

	        for (int element : array) {
	            elementCountMap.putIfAbsent(element, 0);
	        }

	        for (int i = 0; i < array.length; i++) {
	            int element = array[i];
	            int count = elementCountMap.get(element) + 1;
	            elementCountMap.put(element, count);
	        }

	        System.out.println("Element Counts:");
	        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
	        }
	    }
	

}
