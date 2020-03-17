package cts;

public class UserMainCode6 {
public static int commonElements(int arr1[],int n1,int arr2[],int n2)
{
	int s=0;
	for(int i=0;i<n1;i++)
	{
		for(int j=0;j<n2;j++)
		{
			if(arr1[i]==arr2[j])
			{
				 s=s+arr2[j];
			}
		}
	}
	return s;
}
}
