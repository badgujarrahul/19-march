package constructor;

public class cc1 {
	int a;
	int b;
	{
		a = 200;
		b = 120;
	}

	public static void main(String[] args) {
		cc1 A = new cc1();
		A.addition();
		A.sub();
	}

	public void addition() {
		int sum = a + b;
		System.out.println("sum of a+b is " + sum);
	}

	public void sub() {
		int sub = a - b;
		System.out.println("sub a&b is " + sub);

	}

}
