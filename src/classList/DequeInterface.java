package classList;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeInterface {

	private Deque<String> sqlQ = new ArrayDeque<>();

	void addInQueue(String customer) {
		sqlQ.addLast(customer);
	}

	void removeFront() {
		sqlQ.removeFirst();
	}

	void removeBack() {
		sqlQ.removeLast();
	}

	void printQueue() {
		System.out.println("Special queue contains: " + sqlQ);
	}

	public DequeInterface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DequeInterface loginSequence = new DequeInterface();
		
		loginSequence.addInQueue("Harrison");
		loginSequence.addInQueue("McCartney");
		loginSequence.addInQueue("Starr");                                         
		loginSequence.addInQueue("Lennon");

		loginSequence.printQueue();

		System.out.println("Removing first");
		loginSequence.removeFront();
		loginSequence.printQueue();
		
		System.out.println("Removing last");
		loginSequence.removeBack();
		loginSequence.printQueue();
		
		
	}

}
