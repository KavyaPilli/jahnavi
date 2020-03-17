package cts;

import java.util.Scanner;

public class SumOfSquaresOfEvenDigits {
	public static int cal(int n)
	{
		int s=0,k=0;
		while(n>0)
		{
			k=n%10;
			if((k%2)==0)
			{ 
				k=k*k;
				s=s+k;
			}
			n=n/10;
		}
			return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SumOfSquaresOfEvenDigits so=new SumOfSquaresOfEvenDigits();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=so.cal(n);
	System.out.println(r);
	}

}
