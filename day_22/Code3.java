package day_22;

import java.util.HashMap;
import java.util.Map;
public class Code3 {
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("apple", 5);
	        map.put("banana", 3);
	        map.put("cherry", 8);
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            String key = entry.getKey();
	            int value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	       
	        
	        
	        
	        
	      }
	    
	}

}

