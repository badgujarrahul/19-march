package ControlStatement;

public class Else_ifStudy {

	public static void main(String[] args) {
		int marks =60 ;
		if (marks >= 60)
		// 60-100 distinction,
		// 55-60 first class,
		// 50-55 second'
		// 40-50 third,
		// below 40 fail
		{
			System.out.println("you are got distintion");
		} else if (marks >= 55 & marks < 60) {
			System.out.println("you got first class");
		}
		else if (marks >=50 & marks<=55) {
			System.out.println("you got second class");
		}
		else if (marks >=40 & marks<=50) {
			System.out.println("you got third class");}
		else
		{System.out.println("you are fail");
	}
}
}