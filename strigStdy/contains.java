package strigStdy;

public class contains {
// result in boolean
//checking availability of char & char sequence
//case sensitive	
	public static void main(String[] args) {
		String n = "pravin";
		System.out.println(n.contains("ra"));
		System.out.println(n.contains("a"));
		System.out.println(n.contains("pra"));
		System.out.println(n.contains("Pra"));
		System.out.println(n.contains("Ra"));

		System.out.println("**********************");

		String a = "india";
		boolean c = a.contains("in");
		System.out.println(c);
		System.out.println(a.contains("RAHUL"));
		System.out.println(a.contains("di"));
		System.out.println(a.contains("In"));
	}

}
