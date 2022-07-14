package polymorphism;

public class PolymorphismStudy {
	public static void main(String[] args) {
		//Declaring multiple methods with same method name but with 
		//different argument in a same class is called 	method overloading.
		//once binding is done, again rebinding can't be done, so it is called static binding.
		PolymorphismStudy mo= new PolymorphismStudy();// object created
		
		add();// static
		PolymorphismStudy.add();// static
		mo.add(90, 89);//non static
		mo.add(10,10, 10);//non static
		
	}

	
	public static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum is "+sum );
	}
	
		
	public void add(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println("Sum is "+sum );
	}
}