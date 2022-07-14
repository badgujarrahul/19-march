package strigStdy;

public class strigLength {

	public static void main(String[] args) {

		String r = "Rahul"; // without using new keyword--> constant pool area
		System.out.println(r.length());
		int s = r.length();
		System.out.println(s);

		System.out.println(",,,,,,,,,,,,,,,,,,,,,,");
		String p = "pan";
		System.out.println(p.length());
		int q = p.length();
		System.out.println(q);
	}

}
