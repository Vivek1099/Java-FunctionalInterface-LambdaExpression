package Generics;

@FunctionalInterface
interface add
{
	void show();//no parameter
}

@FunctionalInterface
interface kk
{
	void hello(int x);//single parameter
}

@FunctionalInterface
interface dd
{
	void demo(int x, int y);//multiple parameter
}



public class ex4_lambda {
	public static void main(String args[])
	{
		add ld=()->{//no parameter
			System.out.println("from show method");
		};
		ld.show();
		kk k=(p)->//single parameter
		{
			System.out.println(p+p);
		};
		k.hello(15);
		dd d=(m,n)->//multiple parameter
		{
			System.out.println(m+n);
		};
		d.demo(12,90);
		
		System.out.println("***************");
		
		add ld1=()->System.out.println("from show method");ld1.show();
		kk ky=(r)->System.out.println(r*2);ky.hello(20);
		dd d1=(x,y)->System.out.println(x+y);d1.demo(12,12);
		
	}
}
