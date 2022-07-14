package strigStdy;

public class b_equals_equalsIgnore_contains_Isempty {

	public static void main(String[] args) {
		String a= "state maharashtra";
		String b="State Maharashtra";
		String c="State Delhi";
		String d=" ";
		System.out.println("**equals**");
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		System.out.println(c.equals(b));
		
		System.out.println("**equals ignore case**");
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		
		System.out.println("**contains**");
		System.out.println(a.contains("maha"));
		System.out.println(c.contains("D"));
		System.out.println("**is empty**");
		System.out.println(a.isEmpty());
		System.out.println(d.isEmpty());
		System.out.println("**is blank**");
		System.out.println(a.isBlank());
		System.out.println(d.isBlank());
		
		
		

	}

}
