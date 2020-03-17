package jstl;
import java.util.Scanner;
public class KasperNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sq=n*n;
int or=sq;
System.out.println(sq);
int var=sq;
String str=Integer.toString(sq);
int l=str.length();
char[] ch=new char[l];
ch=str.toCharArray();
String s1="",s2="";
for(int i=0;i<l;i++)
{
if(i<l/2)
s1=s1+Character.toString(ch[i]);
else
s2=s2+Character.toString(ch[i]);
}
int n1=Integer.parseInt(s1);
int n2=Integer.parseInt(s2);
int sum=n1+n2;
if(sum==n)
System.out.println("Given number is a Kaspher Number");
else
System.out.println("Given number is not a Kaspher Number");
}
}
