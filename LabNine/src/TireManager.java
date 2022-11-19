import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TireManager {
	
	private Queue<Integer> customerQueue;
	private Stack<Integer> tireStack;
	
	public TireManager() {
		customerQueue = new LinkedList<Integer>();
		tireStack = new Stack<Integer>();
		initCustomerQueue();
		initTireStack();
	}
	
	public void serveNextCustomer() {
		//your code here
	}
	
	public boolean stillCustomers() {
		return customerQueue.size() > 0;
	}
	
	private void initCustomerQueue() {
		
		customerQueue.offer(2);
		customerQueue.offer(1);
		customerQueue.offer(5);
		customerQueue.offer(3);
		customerQueue.offer(2);
		customerQueue.offer(4);
		customerQueue.offer(6);
		
	}
	
	private void initTireStack() {
		
		tireStack.push(6);
		tireStack.push(6);
		tireStack.push(6);
		tireStack.push(6);
		tireStack.push(5);
		tireStack.push(5);
		tireStack.push(5);
		tireStack.push(5);
		tireStack.push(4);
		tireStack.push(4);
		tireStack.push(4);
		tireStack.push(4);
		tireStack.push(3);
		tireStack.push(3);
		tireStack.push(3);
		tireStack.push(3);
		tireStack.push(2);
		tireStack.push(2);
		tireStack.push(2);
		tireStack.push(1);
		tireStack.push(1);
		tireStack.push(1);
		tireStack.push(1);
		
	}
	

}
