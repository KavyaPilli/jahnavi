import java.util.Scanner;
import java.util.regex.Pattern;
class HexaDecimal
{
	public static void InHtml(String str)
	{
		boolean b=Pattern.matches("(#)[A-F0-9]{8}",str);
		if(b)
			System.out.println("valid");
		else
			System.out.println("not valid");
	}
}
public class UserMainCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		HexaDecimal hd=new HexaDecimal();
		hd.InHtml(str);
	}

}
