package day_15;

public class Main {
public static void main(String[] args) {
int max=0;
int[] a= {55,2,4,1,456,78,987,3222,122};
System.out.println("Largest element in array");
for (int i = 0; i < a.length-1; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]<a[j]) {

			max=a[j];
		}
	}
	
}
System.out.println("Largest element:"+max);

	
}


}
