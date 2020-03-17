package cts;

public class UserMainCode2 {
	public static String findRoots(float a,float b,float c)
	{
		float disc=b*b-(4*a*c);
		if(disc>0)
		{
		  return "real and unequal";
		}
		else if(disc==0)
		{
			 return "real and equal";
		}
		else
		{
			 return "imaginary";
		}
	}

}
