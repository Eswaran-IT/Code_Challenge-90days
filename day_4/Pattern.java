package day_4;

public class Pattern {
public static void main(String[] args) {
	int n=5;
	System.out.println("Print the pattern");
	recursion(n);
}
  public static  void recursion(int a) {
	 if(0<a) {
		 System.out.println();
		 for (int i = 1; i < a+1; i++) {
			 System.out.print((i));
		}
		a--;
		recursion(a);
	}
	
}
}
