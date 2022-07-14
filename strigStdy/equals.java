package strigStdy;

public class equals {

	public static void main(String[] args) {
	String a= "Rahul";
	String b="Rahul";
	String c= new String("Rahul");
	String d= new String("Rahul");
	String e= new String("RAHUL");
	// === compares memory locations of two operands
	// equals method compare character sequence of two objects
System.out.println(a==b);
System.out.println(c==d);
System.out.println(a==d);
System.out.println("================");
System.out.println(a.equals(b));//char check
System.out.println(a.equals(c));//char check
System.out.println(a.equals(d));//char check
System.out.println(a.equals(e));//char check
System.out.println("================");
boolean result=a.equals(d); // capital and lower check
System.out.println(result);
System.out.println("================");
System.out.println(d.equals(e));// checking character sequence along with case sensitivity

	}

}
