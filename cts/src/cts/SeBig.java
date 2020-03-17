package cts;
import  java.util.Scanner;
public class SeBig {
 public void FindBig(int a[],int n,int se)
 {
	 int s=0;
	for(int i=0;i<n;i++) 
	{
		if(a[i]>se)
		{
			s=s+a[i];
		}
	}
	System.out.println("Sum of array elements"+s);
	while(s>0)
	{
		int r=s%10;
		System.out.print(r);
		s=s/10;
	}
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter array values value");
		a[i]=sc.nextInt();
		}
		System.out.println("Enter a value");
		int se=sc.nextInt();
		SeBig s=new SeBig();
		s.FindBig(a,n,se);
	}

}
