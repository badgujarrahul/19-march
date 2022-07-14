package LogicalProgram;

import java.util.Scanner;

import strigStdy.strigLength;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string for reverse ");
		String a = sc.next();
		String b = "";
		for(int i=a.length()-1;i>=0;i--)
		{
		b=b+a.charAt(i);
		

}
		System.out.println("original string is "+a);
		System.out.println("reverse string is "+b);
		

	}}
