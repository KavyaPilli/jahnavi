package cts;
import  java.util.Scanner;
public class Odd {
public void OddNum(int n)
{ 
	int s=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			s=s+i;
		}
	}
	System.out.println("Sum of odd numbers"+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
	    Odd on=new Odd();
		on.OddNum(n);
	}

}
