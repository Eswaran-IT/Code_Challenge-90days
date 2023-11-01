package day_24;
import java.util.ArrayDeque;
import java.util.Stack;

public class Code5 {
	    public static void main(String[] args) {
	        // Create a queue
	        ArrayDeque<Integer> queue = new ArrayDeque<>();

	        // Insert 5 elements into the queue
	        for (int i = 1; i <= 5; i++) {
	            queue.offer(i); // Enqueue elements into the queue
	        }

	        System.out.println("Initial Queue: " + queue);

	        // Dequeue from the queue to a stack and push onto the stack
	        Stack<Integer> stack = new Stack<>();
	        while (!queue.isEmpty()) {
	            stack.push(queue.poll()); // Dequeue from the queue and push onto the stack
	        }

	        System.out.println("Stack: " + stack);
	        stack.pop();
	        System.out.println("Peek:"+stack.peek());
	    }
	}

