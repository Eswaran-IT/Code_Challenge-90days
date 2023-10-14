package day_9;

public class SecondMax {
public static void main(String[] args) {
	System.out.println("Find second max element");
	int a[]= {3,4,876,56,33};
	int max=a[0];
	int smax=0;
	for (int i = 1; i < a.length; i++) {
		if (a[i]>max) {
			smax=max;
			max=a[i];
			System.out.println(smax);
		}else if (a[i] > smax) {
            smax = a[i];
        }
	}
	System.out.println(smax);
	
	
}
}
