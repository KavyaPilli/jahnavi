package cts;

public class GenericDemo1<A,B> {
	A a;
	B b;
	public GenericDemo1(A obj1,B obj2)
	{
		a=obj1;
		b=obj2;
	}
	public void display()
	{
		System.out.println(a+" , "+b);
	}
	public A reta()
	{
		return a;
	}
	public B retb()
	{
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 GenericDemo1<Integer,Double> obje=new GenericDemo1<Integer,Double>(11,33.23);
 int x=(int)obje.reta();
 double y=(double)obje.retb();
 double z=x*y;
	System.out.println("Multiplication is"+z);
	 GenericDemo1<String,Character> obje1=new GenericDemo1<String,Character>("Hello World",'k');
obje1.display();
	}
}
