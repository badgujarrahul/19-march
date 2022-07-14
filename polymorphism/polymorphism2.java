package polymorphism;

public class polymorphism2 {

	public static void main(String[] args) {
	polymorphism2 a= new polymorphism2();
	a.add();
	a.add(3, 5);
	a.add(2, 4, "rahul");

	}

	
	
	public void add() {
		int x=5;
		int y=4;
		int sum=x+y;
		System.out.println("sum of x,y is "+sum);
	}
	public void add(int x,int y) {
		int sum=x+y;
		System.out.println("the add of int x&y is "+sum);
	}
	public void add(int x,int y,String name) {
		int sum=x+y;
		System.out.println("the add of int x&y is "+sum);
		System.out.println("my name is "+name);
	}
}
