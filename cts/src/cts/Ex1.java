package cts;
import java.util.Scanner;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter a string ");
		String s=sc.nextLine();
		
		try {	
			int n=Integer.parseInt(s);
			System.out.println("square is "+n*n);
			
		 }
		catch (NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}

	}

}
