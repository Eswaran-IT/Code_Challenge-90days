package day_19;

public class Code4 {
public static void main(String[] args) {
	System.out.println("Target Element");
	int [] a= {5,4,3,2,1,0};
	int tar=4,checker=0;
	Boolean found=false;
	for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			checker=a[i]+a[j];
			if (checker==tar) {
				System.out.println("Found @"+i+"and"+j);
				break;
				
			}
		}
		  if (found) {
              break;
	}

}
}}
