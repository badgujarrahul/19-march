package LogicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please value of R");
	int R= sc.nextInt();
	System.out.println("please enter value of P");
	int P= sc.nextInt();
	int sum = P+R;
System.out.println("add of P+R is "+ sum);
	}
}
