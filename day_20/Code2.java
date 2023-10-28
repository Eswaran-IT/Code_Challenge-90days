package day_20;

public class Code2 {
	public static void main(String[] args) {
		
	int []ar= {1,0};
	System.out.println("Pattern 2");
    int n=6,d=0;
    for (int i = 0; i < n; i++) {
    	
		for (int j = 0; j <=i; j++) {
			System.out.print(ar[d]+" ");
			d++;
			if (d==ar.length) {
				d=0;
			}
		}
		System.out.println();
	}
	}
}
