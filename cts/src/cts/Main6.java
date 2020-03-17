package cts;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter array 1 element");
			arr1[i]=sc.nextInt();
		}
			
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			System.out.println("Enter array 2 element");
			arr2[i]=sc.nextInt();
		}
			System.out.println("sum of common element is "+UserMainCode6.commonElements(arr1,n1,arr2,n2));
	

	}

}
