package day_29;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Subarray");
	int a[]=new int[] {1,2,3,6,45,67};
	int size=3,sum=0,tar=6;
	for (int i = 0; i < a.length-3; i++) {
		for (int j = 0; j < size; j++) {
			sum+=a[j];
			if (sum==tar) {
				System.out.println("Found at "+i+" and upto"+j);
			}
		}
		
	}
	


}
}

