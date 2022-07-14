package strigStdy;

public class allString {

	public static void main(String[] args) 
	{
	String name="Velocity";
	//length() method use
	System.out.println("length");
	System.out.println(name.length());
	int leghtOfString = name.length();
	System.out.println(leghtOfString);
	//toUpperCase() method use
	System.out.println("to uppercase");

	System.out.println(name);
	System.out.println(name.toUpperCase());
	String m = name.toUpperCase();
	System.out.println(m);
	System.out.println("lowercase");

	//toLowerCase() method use
	System.out.println(m.toLowerCase());
	String n = m.toLowerCase();
	System.out.println(n);
	//equals() method use
	
	String a="Velocity";
	String b="Velocity";
	String c=new String("Velocity");
	String d= new String("Velocity");
	String e= new String("VELOCITY");
	// === compares memory locations of two operands
	// equals method compare character sequence of two objects
	System.out.println("equals");

	System.out.println(a==b);
	System.out.println(c==d);
	System.out.println("========");
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(a.equals(d));
	boolean result = a.equals(c);
	System.out.println("a and c are equal == "+result);
	System.out.println(d.equals(e));// checking character sequence along with 
	//case sensitivity 
	//equalsIgnoreCase() method use
	System.out.println("equals ignore");

	String city="Pune";
	String locality="Pune";
	String dist="pune";
	System.out.println(city.equals(dist));
	System.out.println(city.equalsIgnoreCase(dist));
	System.out.println("===============");
	//contains() method use
	System.out.println("contains");

	String k="Katraj";
	System.out.println(k.contains("Ka"));
	System.out.println(k.contains("ar"));
	}
	}

