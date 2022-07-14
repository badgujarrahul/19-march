package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class firstArraylist {

	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		A.add("RAHUL");// 0
		A.add("RAHUL");// 1// duplicates allowed
		A.add(90);// 2
		A.add('z');// 3
		A.add(95);// 4
		A.add("96.2f");// 5
		A.add(null);// 6  allows any no of null values
		A.add(null);// 7
		//order of insertion-maintain,storage type: index
		System.out.println(A);
		System.out.println(A.size());
		System.out.println(A.get(4));
		System.out.println(A.lastIndexOf("RAHUL"));
		System.out.println(A.indexOf("RAHUL"));
		System.out.println(A.get(2));
		System.out.println(A.contains(96));
		A.add(1,"Yogesh");// add on index 1
		System.out.println(A);
		A.remove(1);
		System.out.println(A);
		System.out.println("**Iterator**");
		Iterator b= A.iterator();
		while (b.hasNext()) 
		{System.out.println(b.next());
			System.out.println("**FOR LOOP**");
			for(int i=0;i<=A.size()-1;i++)
			{System.out.println(A.get(i));
		}
			System.out.println("**********");
		for(Object o:A) {
			System.out.println(o);
			
		}

	}}

}
