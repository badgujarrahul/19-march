package strigStdy;

public class d_charAt_EndsWith_StartWith_substring_cconcat_indexof {

	public static void main(String[] args) {
	String a="state is maharashtra";
	String b="State Is Maharashtra";
	System.out.println("**charAt**");
	System.out.println(a.charAt(4));
	System.out.println("**ends With**");
	System.out.println(a.endsWith("a"));
	System.out.println(a.endsWith("htra"));
	System.out.println("**start with**");
	System.out.println(b.startsWith("S"));
	System.out.println(a.startsWith("St"));
	System.out.println("**substring**");
	System.out.println(a.substring(4));
	System.out.println(b.substring(8));
	System.out.println("**concat**");
	System.out.println(a.concat(" i m"));
	System.out.println("**index of **");
	System.out.println(b.indexOf("s"));
    System.out.println(a.lastIndexOf("m"));
    System.out.println(a.lastIndexOf("h"));
   // System.out.println(a.split()); use in array
	}

}
