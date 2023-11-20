package day_39;

public class Code5 {
	    public static int reverseBits(int n) {
	        int result = 0;
	        
	        for (int i = 0; i < 32; i++) {
	            result = (result << 1) | (n & 1);
	            n >>>= 1; // Use unsigned right shift
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        int input = 0b00000010100101000001111010011100;
	        int output = reverseBits(input);

	        System.out.println("Input: " + Integer.toBinaryString(input));
	        System.out.println("Output: " + Integer.toBinaryString(output) + " (" + output + ")");
	    
	

}
}
