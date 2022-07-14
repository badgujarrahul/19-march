package strigStdy;

public class Index_of {
//o/p is int value
	public static void main(String[] args) {
		String Name = "Sankete";
		System.out.println(Name.indexOf('a'));
		System.out.println(Name.indexOf('t'));
		System.out.println(Name.indexOf('s'));// bcoz case sensitive so error
		System.out.println(Name.indexOf("et"));
		System.out.println(Name.indexOf('e', 5));
		System.out.println(Name.lastIndexOf('e'));//char take from last but index no count from 0
		System.out.println(Name.lastIndexOf('e', 5));// take from 5 no and go backward
		
		System.out.println("**********");
		
		
		String state="Maharashtr ";
		System.out.println(state.indexOf('a'));
		System.out.println(state.indexOf('a', 4));
		System.out.println(state.lastIndexOf('h'));
	}

}
