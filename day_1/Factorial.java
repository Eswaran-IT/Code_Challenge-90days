package day_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    	int result,n;
		System.out.println("Factorial code");
		System.out.println("Enter the number");
		Scanner getScanner=new Scanner(System.in);
		n=getScanner.nextInt();
		result=factorial(n);
		System.out.println(result);
		getScanner.close();
		
	}
    public static int factorial(int data) {
        if (data == 0 || data == 1) {
            return 1;
        } else {
            return data * factorial(data - 1);
        }
    }
}
