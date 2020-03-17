package cts;

public class UserMainCode3 {
public static boolean isPrime(int number)
{
	 int c=0;
	for(int i=1;i<=number;i++)
	{
		if(number%i==0)
		{
			c++;
		}
	}
	if(c==2)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
