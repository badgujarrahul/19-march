package W3GroupPractice;

public class GlobalVariable {
	int a = 5;
	static int b = 12;

	public static void main(String[] args) {
		GlobalVariable RA = new GlobalVariable();
		RA.test();
		RA.test1();
		System.out.println("value of A is " + RA.a);
		System.out.println("value of B is " + b);
		Sample SA = new Sample();
		System.out.println("calling from sample i.e.non static global variable " + SA.p);
		System.out.println("global static variable calling from another class " +SA.q);
		int sub=800-RA.a;
		int sub1=20-b;
		int sub2=820-SA.p;
		int sub3=920-Sample.q;
		
		System.out.println("sub is "+sub);
		System.out.println("sub1 is "+sub1);
		System.out.println("sub2 is "+sub2);
		System.out.println("sub3 is "+sub3);
	}

	public void test() {
		int a = 250;
		int sum = a + 200;
		int sub = b - 2;
	}

	public static void test1() {
		int sub = b - 3;
	}

}