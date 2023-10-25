package day_18;

public class code1 {
public static void main(String[] args) {
	System.out.println("Workspace");
	//add(2,3,4,5); not possible
	Integer a[]= {1,2,3,4};
	Integer b[]= {1,2,3};
	add(a);
	add(b);
	
}

public static  <T> void add(T a[]) {
	for (T t : a) {
		System.out.print(t+" ");
	}
}


}
