package cts;
import  java.util.Scanner;
class Nsum
{ 
	public void Summing(int n)
	{
		int s=0;
	 while((n>0)||(s>9))
	 {
		 if(n==0)
		 {
			 n=s;
			 s=0;
		 }
		 int r=n%10;
		 s=s+r;
		 n=n/10;
	 }
	 System.out.println("Summ of the given number is "+s);
	}
	}
	
public class SumOfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
Nsum ns=new Nsum();
ns.Summing(n);
	}

}
