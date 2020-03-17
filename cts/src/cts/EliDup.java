package cts;
import  java.util.Scanner;
public class EliDup {
public int Duplicates(int a[],int n)
{  
	//int b[]=new int[n];
	int flag=0,s=0;
	 for(int i=0;i<n;i++)
	 { 
		 for(int j=i+1;j<n;j++)
		 {
			 if(a[i]==a[j])
			 {
				 a[j]=a[n-1];
				 n--;
				 j--;
			 }
		 }
	 }
	 for(int i=0;i<n;i++)

	 {
		 System.out.println(a[i]);
	 }
	 
	 for(int j=0;j<n;j++)
	 {
	 if(a[j]%2==0)
	 {
		 flag=1;
		 s=s+a[j];
	 }
	 }
	 if(flag==0)
	 {
		 return -1;
	 }
	 else
	 {
		 return s;
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
		System.out.println("Enter a arry  value");
		 a[i]=sc.nextInt();
		}
		 EliDup ed=new EliDup();
		 System.out.println("Sum of Elemnts"+ed.Duplicates(a, n));
	    }
	
}
