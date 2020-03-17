package cts;

public class UserMainCode5 {
 public static  int  binElement(int arr[],int se,int n)
 {
	int low=0,high=n-1,mid=0,flag=0;
	while( low<=high)
{
	mid=(low+high)/2;
	if(arr[mid]==se)
	{
		flag=1;
		break;
	}
	else if(arr[mid]<se)
	{
		 low=mid+1;
		
	}
	else
	{
		high=mid-1;
	}
 }
	if(flag==0)
	{
		return 0;
	}
	else
	{
		return 1;
	}

 }
}
