package Inheritance;

public class multilevelnh {

	public static void main(String[] args) {
		PlantHead P = new PlantHead();
		P.motivate();// own proprty
		P.increment();
		System.out.println("********************************");
		manager M = new manager();
		M.knowledge();
		M.plan();
		M.motivate();
		M.increment();
		System.out.println("********************************");
		engineer E = new engineer();
		E.hardwork();
		E.skills();
		E.knowledge();
		E.plan();
		E.motivate();
		E.increment();
		System.out.println("*********************************");
	}

}
