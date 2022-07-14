package ControlStatement;

public class Method_If {
	static int a = 2012;
	static int b = 2001;
	static int c = 1992;

	public static void a() {
		if (a % 4 == 0) {
			System.out.println("first year is leap year");

		} else {
			System.out.println("first year is not leap year");
		}
	}

	public static void b() {
		if (b % 4 == 0)

		{
			System.out.println("second year is leap year");

		} else {
			System.out.println("second year is not leap year");
		}
	}
	
	public static void c()
	{
		if (c % 4 == 0) {
			System.out.println("third year is leap year");
			
			} else {
			System.out.println("third year is not leap year");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		b();
		c();

	}

}


