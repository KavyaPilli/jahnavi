package cts;

public class TestNumber {


	public void TstNum(int n) throws OddNumberException,EvenNumberException

	{
		if( n%2==0)
		{
			throw new OddNumberException();
		}
		else
		{
			throw new EvenNumberException();

		}
	}
}
