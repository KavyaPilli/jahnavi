package cts;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter array element");
			arr[i]=sc.nextInt();
		}
			
		System.out.println("Enter se");
		int se=sc.nextInt();
		System.out.println(UseMainCode4.findElement(arr,se,n));
	}

}
