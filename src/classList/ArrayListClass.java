package classList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public ArrayListClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		for (int i=1; i <10; i++)
			nums.add(i);
		System.out.println ("Original list: " + nums);
		
		Iterator<Integer> numsIter = nums.iterator();
		while(numsIter.hasNext()) {
			numsIter.next();
			numsIter.remove();
		}
		
		System.out.println("List after removing all elements: " + nums);
	}

}
