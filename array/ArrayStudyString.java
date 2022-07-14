package array;

public class ArrayStudyString {

	public static void main(String[] args) {
		String Name[] = new String[3];
		Name[0] = "vendor";
		Name[1] = "quality";
		Name[2] = "sales";

		System.out.println(Name[0]);
		System.out.println(Name[1]);
		System.out.println(Name[2]);

		System.out.println("==by using loop==");
		for (int a = 0; a <= 2; a++) { // a=max value of index
			System.out.println(Name[a]);
		}
		System.out.println("== by using loop decrement");
		for (int a = 2; a >= 0; a--) {
			System.out.println(Name[a]);
		}
		System.out.println("== by using loop with length increment==");
		for (int b = 0; b <= Name.length - 1; b++) {
			System.out.println(Name[b]);
		}
		System.out.println("== by using loop with length decrement==");
		for (int b = Name.length - 1; b >= 0; b--) {
			System.out.println(Name[b]);
		}
	}
}
