	package cts;
import java.util.Scanner;
public class PallinndromeDifferentVowels {
	public static void CheckPal(String str1)
	{
		int flag=0;
		StringBuilder sbf= new StringBuilder(str1);
	 String str2= sbf.reverse().toString();
	 if(str1.equals(str2))
	 {
		 int j=0;
		 char arr[]=new char[str1.length()];
		 for(int i=0;i<str1.length();i++)
		 {
			 if((str1.charAt(i)=='a')||(str1.charAt(i)=='e')||(str1.charAt(i)=='i')||(str1.charAt(i)=='o')||(str1.charAt(i)=='u'))
					 {
				 arr[j]=str1.charAt(i);
			//	 System.out.println(arr[j]);
				 j++;
				 }
		}
		
		 
		 for(int i=0;i<j-1;i++)
		 {
			 if((arr[i])!=(arr[i+1]))
			 {
				 flag=1;
			 }
					 
		 }
		 if(flag==1)
		 {
		 System.out.println("Valid");
		 }
		 else
		 {
			 System.out.println("Invalid");
		 }
	 }
	 else
	 {
		 System.out.println("not Pallindrome");
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StringBuilder sb=new StringBuilder();
System.out.println("Enter a string");
String str=sc.nextLine();
CheckPal(str);

	}

}
