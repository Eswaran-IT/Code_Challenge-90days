package day_18;

public class code3 {
public static void main(String[] args) {
	System.out.println("Array iteration");
	int a[] = null;//nullpoinnterexception
	 float b[]=new float[5];
	for (int i = 0; i < 5; i++) {
		b[i]=i;
	}
	int sum=(int) b[0];
	System.out.println("Sum of elements");
	for (int i = 0; i < b.length-1; i++) {
		for (int j = i+1; j < b.length; j++) {
			sum+=b[j];
		}
	}
	System.out.println("Sum :"+sum);

	System.out.println("Sum of n numbers"+(2*(2+1)/2));
	
	String wordString=java.util.Arrays.toString(b);
	System.out.println(wordString);
 
   System.out.println(b.getClass());


}
}
