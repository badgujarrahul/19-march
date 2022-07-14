package AccessSpecifire;

import April.variableStudy1;

public class VariableSpecifire {
	public int a = 20; // public global variable
	private int b = 5; // private global variable
	int c = 10; // default global variable
	protected int d = 3; // protected global variable

	public static int e = 12; // static public global variable
	private static int j = 14; // static private global variable
	static int g = 8; // static default global variable
	protected static int h = 2; // static protected global variable

	public static void main(String[] args) {
		VariableSpecifire A = new VariableSpecifire();
		A.add(); // non static public method
		System.out.println("------------------------");
		A.sub();//non static private
		System.out.println("------------------------");
		VariableSpecifire.min(); // default static method
		System.out.println("------------------------");
		VariableSpecifire.max();
		System.out.println("------------------------");
		System.out.println("non static public variable is " + A.a); // non static public variable
		System.out.println("non static private variable is " + A.b); // non static private variable
		System.out.println("non static default variable is " + A.c); // non static default variable
		System.out.println("non static protective variable is " + A.d);// non static protected variable
		System.out.println("--------------------------");
		System.out.println("static public variable is " + e); // static public variable
		System.out.println("static private variable is " + j); // static private variable
		System.out.println("static default variable is " + g);// static default variable
		System.out.println("static protective variable is " + h);// static protected variable
		System.out.println("---------------------------");
	}

	public void add() {
		int sum = a + b;
		System.out.println("Sum of non static variable a&b " + sum);
	}

	private void sub() {
		int sub = c - d;
		System.out.println("sub of non static variable c &d " + sub);
	}

	static void min() {
		int sub = j - e;
		System.out.println("sub of non static variable g &h " + sub);
	}

	static protected void max() {

		int sum = g + h;
		System.out.println("Sub of static variable j& e " + sum);

	}

}
