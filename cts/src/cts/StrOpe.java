package cts;
import java.util.Scanner;
class StrTest
{
         public void TestStr(String str)
		 {
			 if((str.charAt(0)!='j')&&(str.charAt(1)!='b'))
			 {
				 System.out.println(str.substring(2,str.length()));
			 }
			 else 
			 {
				 System.out.println(str);
			 }
		 }
}
public class StrOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enetr a String");
String str=sc.nextLine();
StrTest ts=new StrTest();
ts.TestStr(str);
	}

}
