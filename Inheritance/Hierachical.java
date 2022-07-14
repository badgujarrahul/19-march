package Inheritance;

public class Hierachical {

	public static void main(String[] args) {
		mother1 m = new mother1();
		m.love();
		mother1.sanskar();
		System.out.println("********************************");
		Son1 s = new Son1();
		s.mobile();
		Son1.laptop();
		s.love();
		Son1.sanskar();
		System.out.println("********************************");
		daughter d = new daughter();
		d.fancyDress();
		d.makeup();
		d.love();
		daughter.sanskar();
		System.out.println("********************************");
	}

}
