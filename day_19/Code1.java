package day_19;
import java.util.Arrays;
public class Code1 {
public static void main(String[] args) {
	System.out.println("Selection sort");
	int [] a= {5,4,3,2,1,0};
	for (int i = 0; i < a.length-1; i++) {
		int min_i=i;
		for (int j = i+1; j < a.length; j++) {
			if (a[j]<a[i]) {
				min_i=j;
			}
			
		}
		
		int temp=a[min_i];
		a[min_i]=a[i];
		a[i]=temp;

		
	}
	System.out.println(Arrays.toString(a));
}
}
