package day_18;
import java.util.Arrays;
public class code2 {
	private static int a=5;
public static void main(String[] args) {
	System.out.println("Doubts Clearance");
	//System.out.println(a); error 
	System.out.println(a);
	name();//static declare of method
	
	int n[]=new int[7];
	for (int i = 0; i < n.length; i++) {
		n[i]=i;
	}
	
	Arrays.copyOf(n, a);
	
	String aString="universe";
	System.out.println(aString);
	
	//loops
	
	for (; ;) {
		System.out.println("Infinite loop");
	}
//	System.out.println('hik');
	
	//Arrays
	
	
		
	
}

public static void name() {
	System.out.println("hi");
}


}
