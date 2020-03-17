package cts;
import java.util.Scanner;

public class Largestandsmallest {
	public static int FindEle(int a[],int n)
	{
		int max=a[0],min=a[0],len=a.length;
		
		if(len!=1)
		{
		for(int i=0;i<n;i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(min<a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Maximum element is "+max+" Minimum element is "+min);
		int r=max-min;
		return r;
		}
		else
		{
			return a[0];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter a array");

		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("Difference is "+FindEle(a,n));
	}

}
