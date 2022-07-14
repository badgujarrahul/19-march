package Inheritance;

public class SingleLevelInh {
	public static void main(String[] args) {
		// MOTHERR
		mother1 M1 = new mother1();
		M1.love();
		mother1.sanskar();
		System.out.println("***********");

		// FROM SON
		Son1 S = new Son1();
		S.mobile(); // own property
		Son1.laptop();
		System.out.println("***********");
		S.love(); // mothers property
		Son1.sanskar();

	}

}
