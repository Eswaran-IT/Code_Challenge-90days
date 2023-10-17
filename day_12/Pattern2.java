package day_12;

public class Pattern2 {
public static void main(String[] args) {
	System.out.println("Pattern 2");
	for (int i = 1; i <=10; i++) {
		System.out.print(i+" ");
		if (i%4==0) {
			System.out.println();
		}
	}
}
}
