package cts;
import java.util.Scanner;
public class TestVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//reading data from the user
System.out.println("Enter age");
int a=sc.nextInt();
Voting v=new Voting();
try {
v.testAge(a);
}
catch(InsufficientAgeException e)
{
	System.out.println(e);

}
catch(InvalidAgeException e)
{
	System.out.println(e);

}
	}

}
