package cts;
import java.util.function.Function;
import java.util.function.Predicate;

public class PreFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,Integer> f=s->s.length();
System.out.println("Length of String is "+f.apply("Kavya"));
Function<Integer,Integer> f1=n->n*n;
System.out.println("Square "+f1.apply(4));
Function<Integer,Integer> f2=x->{
	int fact=1;
	for(int i=2;i<=x;i++)
	{
		fact=fact*i;
	}
	return fact;
};
System.out.println("Factorial is "+f2.apply(4));
Function<String,Integer> str=s->{
	int c=0;
	for(int i=0;i<s.length();i++)
	{
	if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
	{
		c++;
	}
	}
return c;
};
System.out.println("no.of vowels in the string is "+str.apply("yamini"));
Function<String,Integer> countblank=s->{
	int c=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			c++;
		}
	}
	return c;
	};
	System.out.println("no.of CHARACTER in the string excluding blankspaces is "+countblank.apply("My name is yamini"));
	}
}
