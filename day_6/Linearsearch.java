package day_6;

public class Linearsearch {
	
  public static void main(String[] args) {
	System.out.println("Linear search");
	int a[] = new int[50];
	int j=0;
	int key=5,size=a.length;
	for(int i=0;i<size;i++) {
		a[i]=i;
	}
	System.out.println("Data of array");
	for(int b:a) {
		System.out.println(b);
	}
	
	while (j<size) {
		if (a[j]==key) {
			System.out.println("Data found at index:"+j);
			break;
		}
		j++;
	}
	
}
}
