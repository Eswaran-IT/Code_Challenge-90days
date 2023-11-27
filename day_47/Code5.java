package day_47;

public class Code5 {
public static void main(String[] args) {
	System.out.println("Triangle pattern");
	   int rows = 5;

       for (int i = 1; i <= rows; i++) {
           for (int j = 1; j <= rows - i; j++) {
               System.out.print(" ");
           }
           for (int k = 1; k <= 2 * i - 1; k++) {
               System.out.print("*");
           }
           System.out.println();
       }
}
}
