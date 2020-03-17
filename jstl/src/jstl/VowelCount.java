package jstl;

import java.util.Scanner;

public class VowelCount {
public static void Count(String str2,int j)
{
	int count=0;
	
	System.out.println("string str2 :"+str2);
	for(int i=0;i<j;i++)
	{
		if((str2.charAt(i)=='a')||(str2.charAt(i)=='e')||(str2.charAt(i)=='i')||(str2.charAt(i)=='o')||(str2.charAt(i)=='u'))
		{
			count++;
		}
	}
	System.out.println("No.of Vowels in "+str2+" is : "+count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String str1=sc.nextLine();
int n=str1.length();
System.out.println("n value:"+n);
//String str2=new String[n];
for(int i=0;i<n;i++)
{
	int j=0;
	if(str1.charAt(i)!=' ')
	{    
//		str2[j]=str1.charAt(i);
		j++;
	}
	else
	{
	//	Count(str2,j);
	}
}
	}
}
