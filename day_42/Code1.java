package day_42;

import java.util.Enumeration;
import java.util.Vector;

public class Code1 {
public static void main(String[] args) {
	System.out.println(System.getProperty("java.version"));
	System.out.println(System.getProperty("java.home"));
	System.out.println(System.getProperty("os.name"));
	System.out.println(System.getProperty("os.version"));
	 Vector<String> fruits = new Vector<>();
     fruits.add("Apple");
     fruits.add("Banana");
     fruits.add("Orange");
     fruits.add("Grapes");
     Enumeration<String> enumeration = fruits.elements();
     while (enumeration.hasMoreElements()) {
         String fruit = enumeration.nextElement();
         System.out.println(fruit);
     }
	}
}
