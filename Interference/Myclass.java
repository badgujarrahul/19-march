package Interference;

public class Myclass implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myclass A= new Myclass();
A.sum();
A.test();
A.test1();
	}

	@Override
	public void test() {
		System.out.println("test");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {System.out.println("test1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum() {
	int	sum=a+b;
		System.out.println(sum);
		// TODO Auto-generated method stub
		
	}

}
