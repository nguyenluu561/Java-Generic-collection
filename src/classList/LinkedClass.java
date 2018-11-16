package classList;

import java.util.*;

public class LinkedClass {

	public LinkedClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palStr ="abcba";
		List<Character> palindrome = new LinkedList<Character>();
		
		for (char ch : palStr.toCharArray())
			palindrome.add(ch);
		
		System.out.println("Input string is: " + palStr);
		
		ListIterator<Character> iterator = palindrome.listIterator();
		ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());
		
		boolean result = true;
	
		while (revIterator.hasPrevious()) {
			if (iterator.next() != revIterator.previous()) {
				
				result = false;
				break;
			}
		}
	
		if (result)
			System.out.print("Input string is a palindrome");
		else
			System.out.print("Input string is not a palindrome");
	}

}
