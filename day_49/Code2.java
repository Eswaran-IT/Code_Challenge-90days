package day_49;

public class Code2 {
    public static void main(String[] args) {
		
        System.out.println("Working with fun facts");

        /* 
         * This is an infinite loop that prints "*********".
         * It is commented out to avoid an infinite execution.
         */
//        for (int i = 0; ; i++) {
//            System.out.println("*********");
//        }
        
        System.out.println(2 + 1);
        System.out.println(2 + "3");
        System.out.println("2" + 2);

        System.out.println("Finding Odd or Even");
        int v = 29;
        if ((v & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        while(v>0) {
        	System.out.println("v"+v);
		   v=v/2;
		}
        System.out.println(v);
    }
}
