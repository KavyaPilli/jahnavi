package cts;
import java.util.Scanner;
public class Pallindrome {
public void CheckPallin(String str1)
{
	StringBuilder sbf= new StringBuilder(str1);
 String str2= sbf.reverse().toString();
 if(str1.equals(str2))
	 System.out.println("Pallindrome");
 else
	 System.out.println("not Pallindrome");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str1=sc.next();
String str2;
Pallindrome p=new Pallindrome();
p.CheckPallin(str1);
	}

}
