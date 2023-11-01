package day_24;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Bitwise  operators for swap two variables");
	int a=6,b=4;
	System.out.println("Before Swapping value of "+"a:"+a+" & the b:"+b);
	System.out.println();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After Swapping value of "+"a:"+a+" & the b:"+b);
}
}
