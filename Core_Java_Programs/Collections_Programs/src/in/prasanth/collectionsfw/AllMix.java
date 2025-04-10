package in.prasanth.collectionsfw;
//import java.util.Collection;
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;
//
//public class AllMix {
//
//	public static void main(String[] args) {
//		Map<Integer, String> m = new TreeMap<>();
//		m.put(8, "Ravi");
//		m.put(2, null);
//		m.put(4, "Harsha");
//		m.put(3, null);
//		m.put(5, "santhosh");
//		System.out.println(m.get(5));
//		Set<Integer> si = m.keySet();
//		Collection<String> cs = m.values();
////		for(Map.Entry<Integer, String> i:m.entrySet())
////		{
////			System.out.println(i.getKey()+" : "+i.getValue());
////		}
//		// System.out.println(m);
//	}
//}
//----------------------------------------------------------------------
// Java code for stack implementation

/*
 * import java.util.Stack;
 * 
 * class AllMix { // Pushing element on the top of the stack static void
 * stack_push(Stack<Integer> stack) { for(int i = 0; i < 5; i++) {
 * stack.push(i); } }
 * 
 * // Popping element from the top of the stack static void
 * stack_pop(Stack<Integer> stack) { System.out.println("Pop Operation:");
 * 
 * for(int i = 0; i < 5; i++) { Integer i1 = (Integer)stack.pop();
 * System.out.println(i1); } }
 * 
 * // Displaying element on the top of the stack static void
 * stack_peek(Stack<Integer> stack) { Integer element = (Integer) stack.peek();
 * System.out.println("Element on stack top: " + element); }
 * 
 * // Searching element in the stack static void stack_search(Stack<Integer>
 * stack, int element) { Integer pos = (Integer) stack.search(element);
 * 
 * if(pos == -1) System.out.println("Element not found"); else
 * System.out.println("Element is found at position: " + pos); }
 * 
 * 
 * public static void main (String[] args) { Stack<Integer> stack = new
 * Stack<Integer>();
 * 
 * stack_push(stack); stack_pop(stack); stack_push(stack); stack_peek(stack);
 * stack_search(stack, 4); stack_search(stack, 6); } }
 */

//Java program to demonstrate the
//working of PriorityQueue
import java.util.*;

class AllMix {

	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(9);
		pQueue.add(15);

		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
	}
}


























