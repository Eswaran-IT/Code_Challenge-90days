package day_52;

public class Code2 {
	    public static void main(String[] args) {
	        double part = 30; 
	        double whole = 100.0; 
	        double percentage = calculatePercentage(part, whole);

	        System.out.println("Percentage: " + percentage + "%");
	    }
	    private static double calculatePercentage(double part, double whole) {
	        if (whole != 0) {
	            return (part / whole) * 100.0;
	        } else {
	            return 0.0;
	        }
	    }
	}
