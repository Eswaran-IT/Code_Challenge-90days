package day_20;

public class Code4 {
    public static void main(String[] args) {
        System.out.println("Pattern 4");
        int n = 6;
        for(int i=0;i<n;i++){
            
            // inner loop for printing the stars at borders only.
            for(int j=0;j<n;j++){
                
                if(i==0 || j==0 || i==n-1 || j==n-1)
                   System.out.print("*");
                   
                // if not border index, print space.
                else System.out.print(" ");
            }
            
            System.out.println();
        }
    
}

}
