package cts;
import java.util.Scanner;
class Integers
{
public void FindTens(int a[],int b[],int n)
{
	int j=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]!=10)
		{
			b[j]=a[i];
			j++;
		}
			
	}
	for(int i=j;i<n;i++)
	{
		b[i]=0;
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("Resultant array "+b[i]);
		                                        
	}
 }
}
public class RemoveTens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter array value");
        a[i]=sc.nextInt();
		}
        Integers i=new Integers();
        i.FindTens(a,b,n);
	}

}
