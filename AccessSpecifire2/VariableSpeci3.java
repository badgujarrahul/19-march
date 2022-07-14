package AccessSpecifire2;

import AccessSpecifire.VariableSpecifire;

public class VariableSpeci3 extends VariableSpecifire {
	public static void main(String[] args) {
		VariableSpeci3 d = new VariableSpeci3();
		System.out.println("public variable a =" + d.a); // public variable
		System.out.println("public variable e=" + VariableSpecifire.e);// public static vari
		System.out.println("protected variable =" + d.d);
		System.out.println("protected variable =" + VariableSpecifire.h);
		VariableSpecifire.max(); // protected method
		d.add(); // public

	}

}
