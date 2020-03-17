package jstl;
import java.util.Scanner;
public class Kasper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=0,t=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sq=n*n;
int[] temp=new int[n];
while(sq>0)
{
	int r=sq%10;
	temp[k]=r;
	k++;
	sq=sq/10;
}
int[] arr=new int[k];
for(int i=0,j=k-1;i<k&&j>=0;i++,j--)
{
	arr[i]=temp[j];
}
int s1=0,s2=0;
int l1=k/2;
int l2=k-l1;
for(int i=0;i<l1;i++)
{
	s1=s1*10+arr[i];	
}
int  j=0;
for(int i=l1;i<k;i++)
{
	temp[j]=arr[i];
	j++;
}
for(int i=0;i<j;i++)
{
	s2=s2*10+temp[i];
}
int res=s1+s2;
if(res==n)
	System.out.println("Kaspher Number");
else
	System.out.println("Not Kaspher Number");
}
}
