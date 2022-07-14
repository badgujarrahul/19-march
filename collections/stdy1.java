package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class stdy1 {

	public static void main(String[] args) {
		LinkedList ra = new LinkedList();
		ra.add("mumbai");
		ra.add("mumbai");
		ra.add(null);
		ra.add(null);
		ra.add(123);
		ra.add(14.14);

		System.out.println(ra);
		System.out.println(ra.size());
		System.out.println(ra.isEmpty());
		System.out.println("**peek**");
		System.out.println(ra.peek());// Retrieve element

		System.out.println(ra);
		System.out.println("**poll**");
		System.out.println(ra.poll());// retrieve & delete
		System.out.println(ra);
		System.out.println("**pop**");
		System.out.println(ra.pop());
		System.out.println("**get**");
		System.out.println(ra.get(2));
		System.out.println(ra);
		System.out.println("**remove**");
		System.out.println(ra.remove());
		System.out.println(ra);
		System.out.println("**for loop**");

		int i;
		for (i = 0; i <= ra.size() - 1; i++)
			
		{
			System.out.println(ra.get(i));
		}

		System.out.println("**iterator**");
		Iterator sb = ra.iterator();
		while (sb.hasNext())
		{
			System.out.println(sb.next());

		}
	}
}