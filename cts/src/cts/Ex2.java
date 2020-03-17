package cts;
import java.util.Scanner;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elemesnts");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		try
		{
		System.out.println("Enter si number");
		int si=sc.nextInt();
		System.out.println("Array element at index "+si+" is "+a[si]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
