package day_60;
import java.util.Arrays;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Array Operations");
	int a[]= {4,3,2,1,0};
	int max=a[0];
	int smax=0,tmax=0;
	for (int i = 0; i < a.length; i++) {
		if(max<a[i]) {
			max=a[i];
		}
		else {
		if (smax<a[i] && a[i]!=max) {
			smax=a[i];
		}
		if(smax>a[i] && max>a[i] && tmax<a[i] )
		{
			tmax=a[i];
		}
		}
	}
	System.out.println("Max-"+max+"Second max-"+smax+"Third max-"+tmax);
	System.out.println(Arrays.toString(a));
}
}
