import java.util.Scanner;
import java.util.regex.Pattern;

class Test{
	public static void Validate(String str)
	{
		int n=str.length();
		boolean b=false;
		b=Pattern.matches("(?=.*\\d)(?=.*[@#$]).{6,20}", str);
		if(b==true)
			System.out.println("valid password");
		else
			System.out.println("invalid passowrd");
	}
}
public class UserMainCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.next();
Test t=new Test();
t.Validate(str);
	}

}
