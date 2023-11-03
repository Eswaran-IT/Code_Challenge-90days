package day_26;
import java.util.Arrays;
import java.util.Scanner;
public class Code3 {
public static void main(String[] args) {
	Scanner getScanner=new Scanner(System.in);
	System.out.println("Enter Number of Data");
   int n=getScanner.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < n; i++) {
		System.out.println("Enter element->"+(i+1));
		a[i]=getScanner.nextInt();
	}

    Arrays.stream(a).forEach(element -> System.out.print(element + " "));
   getScanner.close();
}
}
