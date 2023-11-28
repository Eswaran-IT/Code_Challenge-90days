package day_49;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Swapping Values");
	int a=2,b=4;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("A"+a+"\t"+"B"+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("A"+a+"\t"+"B"+b);
}
}
