package constructor;

public class UserDefineConstructor

 {
	public UserDefineConstructor()
	{
	System.out.println("hi this is user define constructor");
    int a=22;
    int b=15;
    System.out.println("value of a is "+a);
    System.out.println("value of b is "+b);
}

	public static void main(String[] args)
	{
		UserDefineConstructor ud= new UserDefineConstructor();// clasname object= new classname
		ud.test();
	}
		public void test()
		{
			System.out.println("its test of constructore");
		
	}

}
