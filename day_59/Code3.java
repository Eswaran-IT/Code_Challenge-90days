package day_59;

public class Code3 {
public static void main(String[] args) {
	System.out.println("Reverse Digits");
	
	System.out.println(reverse_digit(245));
}
static long reverse_digit(long N) {
    long reversedNumber = 0;

    while (N != 0) {
    	//not removes
        long digit = N % 10;
        System.out.println(N);
        System.out.println(digit);
        reversedNumber = reversedNumber * 10 + digit;
        System.out.println(reversedNumber);
        //to remove or divide
        N /= 10;
        System.out.println(N);
    }
    return reversedNumber;
}
}
