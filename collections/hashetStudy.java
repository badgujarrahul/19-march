package collections;

import java.util.HashSet;

public class hashetStudy {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("rahul");
		hs.add("rahul");
		hs.add(null);
		hs.add('a');
		hs.add(12.5);// order of excision is not maintain
		hs.add(11);
		System.out.println(hs);
		
	}

}
