package cts;

public class Voting {

	public Voting() {
		// TODO Auto-generated constructor stub
	}
	public void testAge(int age) throws InsufficientAgeException, InvalidAgeException
	{
		//testing the age 
		if(age>=0 && age<18)
		{
			//if age is greater than 0 and lessthan 18 we throw insufficient age exception 
		throw new InsufficientAgeException();
		}
		else if(age<=0 || age>=100)
		{
			//if age is lessthan 0 and greater than 100 we throw invalid age exception 
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("ur eleigible for voting");
	}
	}
}
