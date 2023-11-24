package day_43;

public class Code1 {
    public static int reverseInteger(int x) {
        int reversed = 0;
        while (x != 0) {
        	//seperate the last digit
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Reverse integer by division");
        int num1 = 123;
        int num2 = -456;
        int num3 = 7890;

        System.out.println(num1 + ": " + reverseInteger(num1));
        System.out.println(num2 + ": " + reverseInteger(num2));
        System.out.println(num3 + ": " + reverseInteger(num3));
    }
}
