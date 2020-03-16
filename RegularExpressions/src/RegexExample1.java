import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern p=Pattern.compile(".s");
Matcher m=p.matcher("as");
boolean b=m.matches();
//System.out.println(b);
boolean b1=Pattern.matches(".s","as");
//System.out.println(b1);
//false(x and y come more than once)
System.out.println(Pattern.matches("[xyz]","xxyyzzz"));
//true bcz set returns only 1 character 
System.out.println(Pattern.matches("[xyz]","x"));

//true bcz it repeats for 3 times
System.out.println(Pattern.matches("[xyz]{3}","xyz"));
System.out.println(Pattern.matches("\\D","m"));//true
System.out.println(Pattern.matches("\\D","1"));//false
System.out.println(Pattern.matches("\\D*","abc"));//true bcz * represenst repetition
System.out.println(Pattern.matches("\\d","m"));//false bcz d returns numbers
System.out.println(Pattern.matches("\\d","1"));//true
System.out.println(Pattern.matches("\\d","123"));//false bcz [] return only 1 letter
	System.out.println("for IP address");
	
	
	}

}
