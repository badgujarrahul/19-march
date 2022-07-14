package April;

public class NonStaticPract {

	public static void main(String[] args) {
		System.out.println("practice non stTic");
		NonStaticPract A=new NonStaticPract();
		A.yog();
		
		MethodCalling B=new MethodCalling();
		B.ganesh();
	}
public void yog()
{
	int a=22;
	int b=10;
	int add=(a+b);
	System.out.println("addition of a+b is "+add);
}

}
