package polymorphism;

public class OvERLOADING {

	public static void main(String[] args) {
		OvERLOADING A= new OvERLOADING();
		OvERLOADING.cashwithdrawal("rahul","cash");
		A.cashwithdrawal("Ganesh", 2000, "Atm");
		A.cashwithdrawal("pravin", 8000, 424301, "monday", 9689319405l, "salary");
		

	}
	public static void cashwithdrawal(String Name,String Method)
	{
		System.out.println("account holder name "+Name);
		System.out.println("Payment method is "+Method);
	}
	
	
	public void cashwithdrawal(String Name,int ammount,String Method)
	{
		
		System.out.println("account holder name"+Name );
		System.out.println("ammount "+ammount );
		System.out.println("payment method "+Method );
		
	}
	
		
	public void cashwithdrawal(String Name,int ammount, int pin,String day,long mob,String Acctype)
	{
		System.out.println("account holder name "+Name);
		System.out.println("withdraw ammount "+ammount);
		System.out.println("pin no "+pin);
		System.out.println("day "+day);
		System.out.println("mobile no "+mob);
		System.out.println("Account type "+Acctype);
	}
}