package day_19;

public class Code3 {
public static void main(String[] args) {
	System.out.println("Using loops effectively");
	System.out.println("Check array is sorted or not");
	//int [] a= {5,4,3,2,1,0};
	int [] a= {0,1,2,3,4,5};
	boolean b=(a[0]<a[a.length-1])?true:false;
	if (b) {
		System.out.println("Sorted Array");
	}
	else {
		System.out.println("Unsorted Array");
	}
	
}
}
