package day_10;

public class ThreadsCode {
	    public static void main(String[] args) {
	        // Create and configure the first thread
	        Thread thread1 = new Thread(new MyRunnable());
	        thread1.setName("Thread 1");
	        thread1.setPriority(Thread.MAX_PRIORITY);

	        // Create and configure the second thread
	        Thread thread2 = new Thread(new MyRunnable());
	        thread2.setName("Thread 2");
	        thread2.setPriority(Thread.MAX_PRIORITY);

	        // Start the threads
	        thread1.start();
	        thread2.start();
	    }
	}

	class MyRunnable implements Runnable {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + ": Count " + i);
	            try {
	                Thread.sleep(1000); // Sleep for 1 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	

}
