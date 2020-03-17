package cts;

import java.util.Scanner;

public class SumofallDigitsinString {
public static void FindSum(String str)
{
	int s=0,r=0;
	for(int i=0;i<str.length();i++)
	{
	if((str.charAt(i)>=48)&&(str.charAt(i)<=57))
	{
		 r=Character.getNumericValue(str.charAt(i));
		s=s+r;
	}
	}
	System.out.println("sum is : "+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        FindSum(str);
	}

}
