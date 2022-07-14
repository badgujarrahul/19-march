package strigStdy;

public class Replace {

	public static void main(String[] args) {
		String name = "prashant & abhijeet";
		System.out.println(name.replace('p', 'a'));
		System.out.println(name.replace("jee", "ki"));
		System.out.println(name.replaceAll("prashant", "ganesh"));
		System.out.println(name.replaceAll(" ", "+"));//replace regex
		System.out.println(name.replaceFirst("a", "q"));// if we wnt to replace strig then we need string, char not allowed 
	}

}
