package day_19;
import java.util.Arrays;

public class Code2 {
public static void main(String[] args) {
	System.out.println("Bubble Sort");
	int [] a= {5,4,3,2,1,0};
	for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	
	
	
	
	
	
	
}
}
