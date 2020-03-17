package cts;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int e,f,h;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter e,f");
		  e=sc.nextInt();
		  f=sc.nextInt();
		  try
		  {
			  h=e/f;
			  System.out.println("The quotient is :"+h);
		  }
		  catch(java.lang.ArithmeticException obj)
		  {
			  System.out.println("Error :"+obj);
		  }
		  System.out.println("Hello Java");
		  System.out.println("Exception handling");
	}

}
