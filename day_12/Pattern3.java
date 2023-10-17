package day_12;

public class Pattern3 {
public static void main(String[] args) {
	System.out.println("Pattern 3");
	for (int row=1; row <=5; row++) {
		for (int col = row; col >0; col--) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	
}
}
