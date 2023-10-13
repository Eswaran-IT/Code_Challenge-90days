package day_8;

public class IntersectionArray {
public static void main(String[] args) {
	System.out.println("To Find the Intersection of two arrays");
	int a[]= {2,3,8,9};
	int b[]= {2,3,3,9,4,5};
	int c[]= new int[4];
	int count = 0;

    for (int i = 0; i < a.length; i++) {
        int data = a[i];
        for (int j = 0; j < b.length; j++) {
            if (data == b[j]) { // Use b[j] for comparison
                c[count] = data;
                count++;
                break; // Once a match is found, exit the inner loop
            }
        }
    }
  for (int i : c) {
	System.out.println(i);
}


}
}
