package day_13;

public class TCS {
public static void main(String[] args) {
	System.out.println("Swap logics ");
	//l1
	int a=5,b=8;
	System.out.println("Before a:"+a+" b:"+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println( "a:"+a+" b:"+b);
	
	//l2
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println( "a:"+a+" b:"+b);
	
	//l3
	b=a+b-(a=b);
	System.out.println( "a:"+a+" b:"+b);
	
}
}
