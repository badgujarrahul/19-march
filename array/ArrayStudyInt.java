package array;

public class ArrayStudyInt {

	public static void main(String[] args) {
		// 54891
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 4;
		a[2] = 8;
		a[3] = 9;
		a[4] = 1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("==By using for loop==");
		for (int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}
		System.out.println("==length method==");

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("==reverse by using loop==");

		for (int i = 4; i >= 0; i--) { // index value of i
			System.out.println(a[i]);
		}
		System.out.println("==reverse by using length method==");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}

	}
}
