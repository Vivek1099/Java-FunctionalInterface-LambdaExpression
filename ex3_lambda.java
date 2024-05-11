package Generics;

@FunctionalInterface //functional interface only contains only one abstract method.
interface hellme
{
	void call(int y);
}

class jp1 implements hellme
{
	@Override //for overriding any functions.
	public void call(int y)
	{
		System.out.println("from call "+y);
	}
}
public class ex3_lambda {
	public static void main(String args[])
	{
		// calling function without using lambda expression.
//		jp1 j=new jp1();
//		j.call(900);
		
		// calling function using lambda expression (->).
		hellme h=(input)->System.out.println("welcome "+input); 
		h.call(120);
	}
}
