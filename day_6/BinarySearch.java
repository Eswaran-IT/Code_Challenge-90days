package day_6;


public class BinarySearch<T> {
public static void main(String[] args) {
	System.out.println("Binary Search Algorithm");
	int a[]=new int[10];
	for (int i = 0; i < a.length; i++) {
		a[i]=i;
	}
	binarysearch(a, 9);
	
}
 public static void binarysearch(int[] arr,int key) {
	  int left=0;
	  int right=arr.length-1;
	  
	  
	  while (left<=right) {
		  int mid=(left+right)/2;
		  if (arr[mid]==key) {
			  System.out.println("Data found at index:"+mid);
			  break;
		} else if (key<arr[mid]) {
			right=mid-1;
		} else {
            left=mid+1;
		} 
     
		
	  
	}
	
	  
	 
	  
	  
 }

}
