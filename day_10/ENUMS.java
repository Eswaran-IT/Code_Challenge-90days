package day_10;

public class ENUMS {
	    

	    public static void main(String[] args) {
	    	enum Color {
		        RED, GREEN, BLUE, YELLOW, ORANGE
		    }
	        Color myColor = Color.BLUE;
	        
	        int nString=Integer.MAX_VALUE;
	        System.out.println(nString);
	        
	        for (Color a : Color.values()) {
				System.out.println(a);
			}

	        switch (myColor) {
	            case RED:
	                System.out.println("You chose red.");
	                break;
	            case GREEN:
	                System.out.println("You chose green.");
	                break;
	            case BLUE:
	                System.out.println("You chose blue.");
	                break;
	            case YELLOW:
	                System.out.println("You chose yellow.");
	                break;
	            case ORANGE:
	                System.out.println("You chose orange.");
	                break;
	            default:
	                System.out.println("Invalid color.");
	        }
	   
	}

}
