package day_42;

public class COde3 {
	    private static int counter = 0;

	    public static void main(String[] args) {
	       
	        Thread thread1 = new Thread(() -> {
	            for (int i = 0; i < 100000; i++) {
	                incrementCounter();
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            for (int i = 0; i < 100000; i++) {
	                incrementCounter();
	            }
	        });
	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Final Counter Value: " + counter);
	    }
	    private synchronized static void incrementCounter() {
	        counter++;
	    }
	

}
