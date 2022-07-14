package array;

public class BooleanStdyArray {

	public static void main(String[] args) {
		boolean a[] = new boolean[2];
		a[0] = true;
		a[1] = false;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println("==by using for loop increment==");
		for (int b = 0; b <= 1; b++) {
			System.out.println(a[b]);

		}
		System.out.println("==by using for loop decrement==");
		for (int c = 1; c >= 0; c--) {
			System.out.println(a[c]);
		}

	}

}
