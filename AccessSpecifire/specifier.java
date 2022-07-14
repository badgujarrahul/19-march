package AccessSpecifire;

public class specifier {
	public static void main(String[] args) {
		specifier P = new specifier();
		P.show1();
		P.show2();
		P.show3();
		P.show4();
	}

	private void show1() {
		System.out.println("hi this is Priv");// PRIVATE CALL FOR ONLY CLASS

	}

	void show2() {
		System.out.println("hi this is Def");// DEFAULT CALL IN PACKAGE

	}

	protected void show3() {
		System.out.println("hi this is Prote");// PROTECTED CALL IN PACKAGE BUT REQUIRED INHERITANCE

	}

	public void show4() {
		System.out.println("hi this is Public");// PUBLIC CALL THROUGH-OUT THE PACKAGE

	}

}
