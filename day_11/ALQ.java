package day_11;

import java.util.ArrayList;
import java.util.List;

public class ALQ {
public static void main(String[] args) {
	System.out.println("Reverse List");
	List<String> l1=new ArrayList<String>();
	for (int i = 10; i >=0; i--) {
		l1.add(""+i);
	}
	System.out.println("Data");
	for (String string : l1) {
		System.out.println(string);
	}
System.out.println(	l1.contains("1"));
	
}
}
