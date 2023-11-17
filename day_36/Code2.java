package day_36;
import java.util.Stack;
public class Code2 {
	public static void main(String[] args) {
		System.out.println("Stack Operations");
		Stack<Integer> a=new Stack<Integer>();
		a.push(34);
		a.push(54);
		a.push(004);
		a.push(4);
		a.push(74);
		a.push(4);
		a.push(24);
		a.push(44);
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a.peek());
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		Stack<String> nameStack = new Stack<>();
        nameStack.push("Alice");
        nameStack.push("Bob");
        nameStack.push("Charlie");
        System.out.println("Stack after pushing names: " + nameStack);
        String poppedName = nameStack.pop();
        System.out.println("Popped name: " + poppedName);
        String topName = nameStack.peek();
        System.out.println("Top name without popping: " + topName);
        boolean isEmpty = nameStack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    
	}

}
