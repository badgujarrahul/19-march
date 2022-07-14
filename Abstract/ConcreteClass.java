package Abstract;

public class ConcreteClass extends AbstrctStudy {

	public static void main(String[] args) {
		ConcreteClass A = new ConcreteClass();
		A.test1();
		AbstrctStudy.test2();
		A.test3();

	}

	public void test1() {
		System.out.println("this is test 1 from Abs");

	}

}
