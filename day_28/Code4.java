package day_28;
import java.util.Scanner;
public class Code4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean orderMore = true;

	        System.out.println("Welcome to the Food Court!");

	        while (orderMore) {
	            System.out.println("Please enter your food order (cake, tea, coffee):");
	            String order = scanner.nextLine().toLowerCase();

	            switch (order) {
	                case "cake":
	                    System.out.println("You ordered a piece of cake.");
	                    break;
	                case "tea":
	                    System.out.println("You ordered a cup of tea.");
	                    break;
	                case "coffee":
	                    System.out.println("You ordered a cup of coffee.");
	                    break;
	                default:
	                    System.out.println("Invalid order. Please choose from cake, tea, or coffee.");
	            }

	            System.out.println("Would you like to order more (yes/no)?");
	            String moreOrders = scanner.nextLine().toLowerCase();

	            if (moreOrders.equals("no")) {
	                orderMore = false;
	            }
	        }

	        System.out.println("Thank you for your orders! Enjoy your meal.");
	        scanner.close();
	    }
	}

