package cts;
public class UserMainCode {
	
	
	public static int checkSum(int n)
	{
	   	int s=0,r=0;
	   	while(n>0)
	   	{
	   		r=n%10;
	   		s=s+r;
	   		n=n/10;
	   	}
		if(s%2==0)
			return -1;
		else
			return 1;
	   	
	}

}
