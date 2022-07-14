package AccessSpecifire2;

import AccessSpecifire.VariableSpecifire;

public class variableSpec4 {
	public static void main(String[] args) {
		VariableSpecifire A=new VariableSpecifire();
		A.add();

		System.out.println("calling public a variable is "+A.a);// non static public
		System.out.println("calling public static variable is "+VariableSpecifire.e);
	}

}
