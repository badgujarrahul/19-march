package Methods;

public class nonStaticMethod {

	public static void main(String[] args) {
		nonStaticMethod rahul= new nonStaticMethod();
		rahul.show();
 
		rahulClass sanket= new rahulClass();
		
		  sanket.studying();
	}
	
	public void show()
	{
		System.out.println("hi now study of non static method");
	}

}
