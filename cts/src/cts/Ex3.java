package cts;
import java.util.Scanner;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int s=0,avg=0;
		int n=args.length;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{ 
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++)
		{
			s=s+a[i];
			avg=s/n;
		}
		System.out.println("Sum is "+s+" avg is "+avg);
	}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");

		}
		catch (InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Number format exception");
		}
	

}
}
