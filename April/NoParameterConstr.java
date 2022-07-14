package April;

public class NoParameterConstr {
	String city = "Pune";
	String name;

	public NoParameterConstr()

	{
		name = "Dhule";

	}

	public static void main(String[] args) {
show1();
NoParameterConstr R= new NoParameterConstr();
R.show();
constructorStudy s=new constructorStudy();
s.Try();
	}

	public void show() {
		System.out.println("hi i m non static display");
		System.out.println("my current city is " + city);
		System.out.println("my proper city is " + name);
	}

	public static void show1() {
		System.out.println("static display method");
	}
}
