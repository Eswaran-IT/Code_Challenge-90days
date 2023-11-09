package day_32;

	class CoffeeMachine {
	    public void makeCoffee(String customerName) {
	        System.out.println("Making coffee for " + customerName);
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(customerName + "'s coffee is ready!");
	    }
	}

	class CustomerThread extends Thread {
	    private CoffeeMachine coffeeMachine;
	    private String customerName;

	    public CustomerThread(CoffeeMachine coffeeMachine, String customerName) {
	        this.coffeeMachine = coffeeMachine;
	        this.customerName = customerName;
	    }

	    public void run() {
	        coffeeMachine.makeCoffee(customerName);
	    }
	}

public class Code2 {
	    public static void main(String[] args) {
	        CoffeeMachine coffeeMachine = new CoffeeMachine();

	        CustomerThread customer1 = new CustomerThread(coffeeMachine, "Alice");
	        CustomerThread customer2 = new CustomerThread(coffeeMachine, "Bob");

	        customer1.start();
	        customer2.start();
	    }
	

}
