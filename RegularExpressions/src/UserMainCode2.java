import java.util.Scanner;
import java.util.regex.Pattern;

class CompareString
{
	public static void Compare(String str)
	{     if((Pattern.matches("PRO[A-Za-z]{4}[0-9]{3}",str))||
			(Pattern.matches("FIN[A-Za-z]{4}[0-9]{3}",str))||
			(Pattern.matches("Test[A-Za-z]{4}[0-9]{3}",str)))
			{
				System.out.println("valid String");
			}
	else {
	System.out.println("Invalid String");
	}
	}
}
public class UserMainCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		CompareString c=new CompareString();
		c.Compare(str);
	}

}
