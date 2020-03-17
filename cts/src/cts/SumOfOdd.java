package cts;
import java.util.Scanner;
public class SumOfOdd {
public static int cal(int n)
{
	int s=0,k=0;
	while(n>0)
	{
		k=n%10;
		if((k%2)!=0)
		{
			s=s+k;
		}
		n=n/10;
	}
	if(s%2!=0)
		return 1;
	else
		return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
SumOfOdd so=new SumOfOdd();
System.out.println("Enter a number");
int n=sc.nextInt();
int r=so.cal(n);
if(r==1)
{
  System.out.println("Sum of odd digits is odd");
}
else
{
	System.out.println("Sum of odd digits is even");
	}
	}

}
