package AccessSpecifire;

public class variableSpeci2 {

	public static void main(String[] args) {
		VariableSpecifire P = new VariableSpecifire();
		System.out.println("value non static variable a =" + P.a);// green-calling global public variable
		System.out.println("value non static variable b =" + P.c);// blue-calling global default variable
		System.out.println("value non static variable a =" + P.d);// yellow-calling global protective variable
		System.out.println("**********************************");
		// static
		System.out.println("value of static variable " + VariableSpecifire.e);// green public variable
		System.out.println("value of static variable " + VariableSpecifire.g);// blue default variable
		System.out.println("value of static variable " + VariableSpecifire.h);// yellow protected varriable
		System.out.println("**********************************");
		P.add();// public method
		System.out.println("**********************************");
		VariableSpecifire.max();// yellow protected
		VariableSpecifire.min();// blue default
		System.out.println("**********************************");

	}

}
