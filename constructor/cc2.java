package constructor;

public class cc2 {

int a;
int b;
public cc2()
{
	a=200;
	b=100;
}
public cc2(int x)
{
	a=x;
	}
public cc2(int x,int y)
{a=x;
b=y;

}
public void sum()
{
	int sum;
	sum=a+b;
	System.out.println("sum a&b is "+sum);
			
}

public static void main(String[] args) 
{
	cc2 So= new cc2();
 So.add();
 
 
	cc2 ra= new cc2(15);
	ra.add();
	
	cc2 ta= new cc2(12,14);
	ta.add();

}
public void add()
{
	int sum=a+b;
System.out.println("sum of a+b is "+ sum);
}
}