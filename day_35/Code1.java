package day_35;
import java.util.PriorityQueue;
import java.util.Queue;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Queue Operations");
	Queue<String> q1=new PriorityQueue<String>();
	System.out.println(q1.size());
	//add to insert 
	q1.add("A");
	q1.add("C");
	//offer for bool result
	System.out.println(q1.offer("Hi"));
	q1.add("B");
	System.out.println(q1);
	System.out.println(q1.size());
	//to get peek data
	System.out.println(q1.peek());
	//removes and returns data
	System.out.println(q1.remove());
	//removes and returns data
	System.out.println(q1.poll());
	//check empty or not
	System.out.println(q1.isEmpty());
	
	
	Queue<Integer> numbers = new PriorityQueue<>();

    // offer elements to the Queue
    numbers.offer(5);
    numbers.offer(1);
    numbers.offer(2);
    System.out.println("Queue: " + numbers);

    // Access elements of the Queue
    int accessedNumber = numbers.peek();
    System.out.println("Accessed Element: " + accessedNumber);

    // Remove elements from the Queue
    int removedNumber = numbers.poll();
    System.out.println("Removed Element: " + removedNumber);

    System.out.println("Updated Queue: " + numbers);

}
}
