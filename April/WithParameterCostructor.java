package April;

public class WithParameterCostructor {

	int a;
	String name;
	String depart;
	char grade;

	public WithParameterCostructor() {
		a = 10;
		name = "rahul";
 		depart = "mech";
		grade = 'b';

	}

	public WithParameterCostructor(int x) {
		a = x;
	}

	public WithParameterCostructor(int x1, String Rahul) {
		a = x1;
		name = Rahul;

	}

	public WithParameterCostructor(int x2, String yogesh, String comp, char d) {
		a = x2;
		name = yogesh;
		depart = comp;
		grade = d;
	}

	public static void main(String[] args) {
		System.out.println("*************");
		WithParameterCostructor c1 = new WithParameterCostructor(14);
		c1.rollNo();
		System.out.println("*************");
		WithParameterCostructor c2 = new WithParameterCostructor(12, "pradip");
		c2.N();
		System.out.println("*************");
		WithParameterCostructor c3 = new WithParameterCostructor(18, "sachin", "ele", 'c');
		c3.m();

		System.out.println("*************");
	}

	public void rollNo() {
		System.out.println("MY ROLL NO IS " + a);
	}

	public void N() {
		System.out.println("my roll no is " + a);
		System.out.println("my name is " + name);

	}

	public void m() {
		System.out.println("MY ROLL NO IS " + a);
		System.out.println("my name is " + name);
		System.out.println("my department is " + depart);
		System.out.println("my grade is " + grade);
	}
}
