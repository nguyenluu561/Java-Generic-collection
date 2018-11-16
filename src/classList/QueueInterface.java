package classList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public QueueInterface() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Queue<String> loginSequence = new LinkedList<String>();
		
		loginSequence.add("Harrison");
		loginSequence.add("McCartney");
		loginSequence.add("Starr");
		loginSequence.add("Lennon");
		
		System.out.println("The login sequence is: " + loginSequence);
		
		while (!loginSequence.isEmpty())
			System.out.println("Removing " + loginSequence.remove());
			
	}

}
