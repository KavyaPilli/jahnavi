package cts;

import java.util.Scanner;

public class NewStr {
public static void NewString(String str,int n)
{
 char arr1[]=new char[n];
 char arr2[]=new char[n];
 int j=0,k=0,c=n;
 StringBuilder sb=new StringBuilder(str);
 String strrev=sb.reverse().toString();
 
 for(int i=0;i<str.length();i++)
 { 
	    if(i<n)
	    {
	  arr1[j]=str.charAt(i);
	    j++;
	    }
	    
 }

 for(int i=0;i<strrev.length();i++)
 { 
	    if(i<n)
	    {
	  arr2[k]=strrev.charAt(i);
	    k++;
	    }
	  
 }
 
/* for(int i=0;i<k;i++)
 { 
	 arr1[j]=arr2[i];
	 j++;
 }*/

 for(int i=0;i<j;i++)
 { 
 System.out.print(arr1[i]);
}
 for(int i=k-1;i>=0;i--)
 { 
 System.out.print(arr2[i]);
}
 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<n/2)
		NewString(str,n);
		else
			System.out.println("n value should be less that stringlength/2");
	}

}
