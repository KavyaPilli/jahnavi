package cts;
import java.util.Scanner;
public class ReverseIncludingZeros {
	public static void Reverse(int n)
	{
		while(n>0)
		{
			int r=n%10;
			System.out.print(r);
		
			n=n/10;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Reverse(n);
	}

}
