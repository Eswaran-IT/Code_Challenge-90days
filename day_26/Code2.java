package day_26;

public class Code2 {
public static void main(String[] args) {
	System.out.println("Finding max and second max element");
	int []a= {3,4,5,6,7,9,8};
	int max=0,smax=0;
	max=a[0];
    for (int i = 0; i < a.length; i++) {
        if (a[i] > max) {
            smax = max;
            max = a[i];
        } else if (a[i] > smax && a[i] != max) {
            smax = a[i];
        }
    }
				

	
	System.out.println("Second Max Element->"+smax);
	System.out.println("Max Element->"+max);
}
}
