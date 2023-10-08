package day_3;

public class Array {
public static void main(String[] args) {
int a[]= {1,2,3,4,5};
int target=3;
//code that print the index of target value by sum of the values
for (int i = 0; i < a.length; i++) {
	if (a[i]+a[i+1]==target) {
		System.out.println(i);
		System.out.println(i+1);
		break;
	}
}
}
}
