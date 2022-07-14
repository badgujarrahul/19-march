package LogicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String Original = sc.next();
		String reverse = "";
		for (int i = Original.length() - 1; i >= 0; i--) {
			reverse = reverse + Original.charAt(i);
		}
		System.out.println("Original String is "+Original);
		System.out.println("Reverse String is "+reverse);
		if(Original.equals(reverse))
		{
		System.out.println("Given string is Palindrome");
		}
		else
		{
		System.out.println("Given string is not Palindrome");

		}
	}

}
