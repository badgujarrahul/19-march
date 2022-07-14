package constructor;

public class MyConPract {
	int num;
	static int age;
	String name;
	float per;
	static char blood;

	public MyConPract(String name1, int num1, int age1, char blood1) {
		name = name1;
		num = num1;
		age = age1;
		blood = blood1;

	}

	public MyConPract(int num2, int age2, String rahul, float per1, char b) {
		name = rahul;
		age = age2;
		num = num2;
		per = per1;
		blood = b;

	}

	public void show() {
		System.out.println("===========================");
		System.out.println("my  name is " + name);
		System.out.println("my empolyee id id " + num);
		System.out.println("my age is " + age);
		System.out.println("my percentage is " + per);
		System.out.println("MY BLOOD GROUP IS " + blood);
		System.out.println("===========================");
	}

	public void show1() {
		System.out.println("======================");
		System.out.println("my name is " + name);
		System.out.println("my age is " + age);
		System.out.println("my blood group is " + blood);
		System.out.println("===========================");
	}

	public void show2() {
		System.out.println("===========================");
		System.out.println("my  name is " + name);
		System.out.println("my empolyee id id " + num);
		System.out.println("my age is " + age);
		System.out.println("my percentage is " + per);
		System.out.println("MY BLOOD GROUP IS " + blood);
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		MyConPract ra = new MyConPract(22, 32, "Yogesh", 85, 'a');
		ra.show();
		MyConPract sa = new MyConPract("Dipak", 28, 25, 'b');
		sa.show1();
		MyConPract ga = new MyConPract(10, 28, "Shiv", 89, 'A');
		ga.show2();

	}
}