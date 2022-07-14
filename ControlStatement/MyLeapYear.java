package ControlStatement;

public class MyLeapYear {

	public static void main(String[] args) {
		int a = 2012;
		int b = 2001;
		int c = 1992;

		if (a % 4 == 0) {
			System.out.println("first year is leap year");

		} else {
			System.out.println("first year is not leap year");
		}

		if (b % 4 == 0) {
			System.out.println("second year is leap year");

		} else {
			System.out.println("second year is not leap year");
		}

		if (c % 4 == 0) {
			System.out.println("third year is leap year");

		} else {
			System.out.println("third year is not leap year");
		}

	}
}
