package cts;

public class Test1 {
	public static int fib(int n)
	{
		if((n==0)||(n==1))
			return n;
		else
			return (fib(n-1)+fib(n-2));
	}
public void primeCheck(int p)
{
	boolean temp=true;
	for(int i=2;i<(p/2);i++)
	{
		if(p%2==0)
		{
			temp=false;
			break;
		}
	}
	if(temp)
		System.out.println("Prime");
	else
		System.out.println("not Prime");

}
}
