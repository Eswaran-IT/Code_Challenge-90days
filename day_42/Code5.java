package day_42;

	enum Color {
	    RED, GREEN, BLUE
	}

public class Code5 {
	    public static void main(String[] args) {
	        Color myColor = Color.GREEN;
	        switch (myColor) {
	            case RED:
	                System.out.println("Selected color is Red");
	                break;
	            case GREEN:
	                System.out.println("Selected color is Green");
	                break;
	            case BLUE:
	                System.out.println("Selected color is Blue");
	                break;
	            default:
	                System.out.println("Unknown color");
	        }
	        System.out.println("All Enums Colors:");
	        for (Color color : Color.values()) {
	            System.out.println(color);
	        
	    }
	}

}
